package com.capgemini.filecontroller;
import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FileTransferController 
{
	@RequestMapping(value="/FileCopy",method=RequestMethod.GET)
	public String fileCopy()
	{
		String baseUrl="http://localhost:9878/copy";
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<String>response=null;
		try
		{
			response=restTemplate.exchange(baseUrl,HttpMethod.GET,getHeaders(),String.class);
		}
		catch(Exception e)
		{
			System.out.println(response.getBody());
		}
		return response.getBody();
	}
		private static HttpEntity<?>getHeaders() throws IOException
		{
			HttpHeaders headers=new HttpHeaders();
			headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
			return new HttpEntity<>(headers);
			
		}
		
		
		@RequestMapping(value="/FileMove",method=RequestMethod.GET)
		public String fileMove()
		{
			String baseUrl="http://localhost:9878/move";
			RestTemplate restTemplate=new RestTemplate();
			ResponseEntity<String>response=null;
			try
			{
				response=restTemplate.exchange(baseUrl,HttpMethod.GET,getHeaders1(),String.class);
			}
			catch(Exception e)
			{
				System.out.println(response.getBody());
			}
			return response.getBody();
		}
			private static HttpEntity<?>getHeaders1() throws IOException
			{
				HttpHeaders headers=new HttpHeaders();
				headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
				return new HttpEntity<>(headers);
				
			}
			
			
			@RequestMapping(value="/FileDelete",method=RequestMethod.GET)
			public String fileDelete()
			{
				String baseUrl="http://localhost:9878/delete";
				RestTemplate restTemplate=new RestTemplate();
				ResponseEntity<String>response=null;
				try
				{
					response=restTemplate.exchange(baseUrl,HttpMethod.GET,getHeaders11(),String.class);
				}
				catch(Exception e)
				{
					System.out.println(response.getBody());
				}
				return response.getBody();
			}
				private static HttpEntity<?>getHeaders11() throws IOException
				{
					HttpHeaders headers=new HttpHeaders();
					headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
					return new HttpEntity<>(headers);
					
				}
				
				
				
				@RequestMapping(value="/Fileupdate",method=RequestMethod.GET)
				public String fileUpdate()
				{
					String baseUrl="http://localhost:9878/updatefile";
					RestTemplate restTemplate=new RestTemplate();
					ResponseEntity<String>response=null;
					try
					{
						response=restTemplate.exchange(baseUrl,HttpMethod.GET,getHeaders111(),String.class);
					}
					catch(Exception e)
					{
						System.out.println(response.getBody());
					}
					return response.getBody();
				}
					private static HttpEntity<?>getHeaders111() throws IOException
					{
						HttpHeaders headers=new HttpHeaders();
						headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
						return new HttpEntity<>(headers);
						
					}
	}


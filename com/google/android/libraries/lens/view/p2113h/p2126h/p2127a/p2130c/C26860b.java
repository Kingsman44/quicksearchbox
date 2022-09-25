package com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.p2130c;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.google.android.libraries.lens.view.h.h.a.c.b */
/* compiled from: PG */
public final class C26860b {

    /* renamed from: a */
    private static final C58974d f73180a = C58974d.m91136j();

    /* renamed from: a */
    public static int m49756a(String str, int i) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderInfoLog(glCreateShader);
        return glCreateShader;
    }

    /* renamed from: b */
    public static String m49757b(Context context, int i) {
        BufferedReader bufferedReader;
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                }
                String sb2 = sb.toString();
                bufferedReader.close();
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return sb2;
            } catch (Throwable th) {
                if (openRawResource != null) {
                    openRawResource.close();
                }
                throw th;
            }
            throw th;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        } catch (Throwable th2) {
            C26859a.m49755a(th, th2);
        }
    }

    /* renamed from: c */
    public static void m49758c(boolean z) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String str = new String();
            while (glGetError != 0) {
                str = GLU.gluErrorString(glGetError);
                ((C58970a) ((C58970a) f73180a.mo56225c()).mo56372aa(49267)).mo56389s("GL error: %s", str);
                glGetError = GLES20.glGetError();
            }
            if (z) {
                throw new IllegalStateException(str);
            }
        }
    }
}

package com.google.android.apps.gsa.speech.audio.p7268e;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59332o;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.speech.audio.e.a */
/* compiled from: PG */
public final class C92186a {

    /* renamed from: a */
    private final Context f257014a;

    /* renamed from: b */
    private final AudioFormat.Builder f257015b = new AudioFormat.Builder().setChannelMask(4).setEncoding(2).setSampleRate(16000);

    public C92186a(Context context) {
        this.f257014a = context;
    }

    /* renamed from: c */
    private static void m151352c(Object obj) {
        try {
            if (obj instanceof AssetFileDescriptor) {
                ((AssetFileDescriptor) obj).close();
            } else if (obj instanceof Closeable) {
                ((Closeable) obj).close();
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public final AudioTrack mo86842a(byte[] bArr, AudioAttributes audioAttributes) {
        AudioFormat.Builder builder;
        C58976aa aaVar = C58975e.f156826a;
        if (!(audioAttributes == null || (builder = this.f257015b) == null)) {
            int length = bArr.length;
            AudioTrack audioTrack = new AudioTrack(audioAttributes, builder.build(), length, 0, 0);
            if (audioTrack.getState() == 0) {
                return null;
            }
            int i = 0;
            while (i < length) {
                int write = audioTrack.write(bArr, i, length - i);
                if (write < 0) {
                    break;
                }
                i += write;
            }
            if (audioTrack.getState() == 1) {
                return audioTrack;
            }
            audioTrack.release();
        }
        return null;
    }

    /* renamed from: b */
    public final byte[] mo86843b(int i) {
        FileInputStream fileInputStream;
        AssetFileDescriptor openRawResourceFd = this.f257014a.getResources().openRawResourceFd(i);
        FileInputStream fileInputStream2 = null;
        if (openRawResourceFd.getLength() > 2147483647L) {
            m151352c(openRawResourceFd);
            return null;
        }
        int length = (int) openRawResourceFd.getLength();
        byte[] bArr = new byte[length];
        try {
            fileInputStream = openRawResourceFd.createInputStream();
            try {
                if (C59332o.m92210a(fileInputStream, bArr, 0, length) == length) {
                    m151352c(fileInputStream);
                    m151352c(openRawResourceFd);
                    return bArr;
                }
                throw new IOException();
            } catch (IOException unused) {
                m151352c(fileInputStream);
                m151352c(openRawResourceFd);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                m151352c(fileInputStream2);
                m151352c(openRawResourceFd);
                throw th;
            }
        } catch (IOException unused2) {
            fileInputStream = null;
            m151352c(fileInputStream);
            m151352c(openRawResourceFd);
            return null;
        } catch (Throwable th2) {
            th = th2;
            m151352c(fileInputStream2);
            m151352c(openRawResourceFd);
            throw th;
        }
    }
}

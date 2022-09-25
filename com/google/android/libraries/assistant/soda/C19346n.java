package com.google.android.libraries.assistant.soda;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.assistant.soda.n */
/* compiled from: PG */
public final class C19346n {

    /* renamed from: a */
    public static final C59071e f54140a = C59071e.m91332i("com.google.android.libraries.assistant.soda.n");

    /* renamed from: b */
    public final C60887da f54141b;

    /* renamed from: c */
    public final Soda f54142c;

    /* renamed from: d */
    public final int f54143d;

    /* renamed from: e */
    public final int f54144e;

    /* renamed from: f */
    public SettableFuture f54145f;

    /* renamed from: g */
    public final Object f54146g = new Object();

    /* renamed from: h */
    public C60870cx f54147h;

    /* renamed from: i */
    public SettableFuture f54148i;

    public C19346n(C60887da daVar, Soda soda, int i, int i2) {
        this.f54141b = daVar;
        this.f54142c = soda;
        this.f54143d = i2;
        this.f54144e = i;
        ((C59052c) ((C59052c) f54140a.mo56224b()).mo56372aa(47631)).mo56393w("channelCount %d, sampleRate %d", i2, i);
    }

    /* renamed from: b */
    static void m36847b(Soda soda, InputStream inputStream, C58833ax axVar, C58833ax axVar2, SettableFuture settableFuture, int i) {
        ((C59052c) ((C59052c) f54140a.mo56224b()).mo56372aa(47635)).mo56386p("Starting to push audio to Soda");
        byte[] bArr = new byte[i];
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        byte[] bArr2 = new byte[16];
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(16);
        if (i == 0) {
            settableFuture.mo57357o(new RuntimeException("Invalid audio buffer size for reading"));
            m36849d(soda, allocateDirect, settableFuture, axVar2);
        }
        while (true) {
            try {
                if (settableFuture.value instanceof C60873d.C60875b) {
                    break;
                }
                allocateDirect.clear();
                int read = inputStream.read(bArr, 0, i);
                if (read < 0) {
                    break;
                } else if (axVar.mo56113h()) {
                    allocateDirect2.clear();
                    int read2 = ((InputStream) axVar.mo56107c()).read(bArr2, 0, 16);
                    if (read2 < 0) {
                        ((C59052c) ((C59052c) f54140a.mo56224b()).mo56372aa(47637)).mo56387q("Read audio bytes %d but could not read timestamps", read);
                        break;
                    } else if (read > 0 && read2 > 0) {
                        m36848c(axVar2, bArr, read);
                        allocateDirect.put(bArr, 0, read);
                        allocateDirect2.put(bArr2, 0, read2);
                        soda.mo24337i(allocateDirect, read, allocateDirect2, read2);
                    }
                } else if (read > 0) {
                    m36848c(axVar2, bArr, read);
                    allocateDirect.put(bArr, 0, read);
                    soda.mo24332h(allocateDirect, read);
                }
            } catch (IOException | UnsupportedOperationException e) {
                ((C59052c) ((C59052c) ((C59052c) f54140a.mo56226d()).mo56382g(e)).mo56372aa(47636)).mo56386p("Failed to push audio to Soda");
                settableFuture.mo57357o(e);
            }
        }
        m36849d(soda, allocateDirect, settableFuture, axVar2);
    }

    /* renamed from: c */
    private static void m36848c(C58833ax axVar, byte[] bArr, int i) {
        if (axVar.mo56113h()) {
            try {
                ((OutputStream) axVar.mo56107c()).write(bArr, 0, i);
            } catch (IOException e) {
                ((C59052c) ((C59052c) f54140a.mo56225c()).mo56372aa(47632)).mo56389s("Failed to write to output stream: %s", e.getMessage());
            }
        }
    }

    /* renamed from: d */
    private static void m36849d(Soda soda, ByteBuffer byteBuffer, SettableFuture settableFuture, C58833ax axVar) {
        ((C59052c) ((C59052c) f54140a.mo56224b()).mo56372aa(47633)).mo56386p("Sending end of audio to Soda.");
        try {
            soda.mo24332h(byteBuffer, 0);
        } catch (IllegalStateException e) {
            settableFuture.mo57357o(e);
        }
        if (axVar.mo56113h()) {
            try {
                ((OutputStream) axVar.mo56107c()).close();
            } catch (IOException e2) {
                ((C59052c) ((C59052c) f54140a.mo56225c()).mo56372aa(47634)).mo56389s("Failed to write to output stream: %s", e2.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void mo24481a() {
        synchronized (this.f54146g) {
            SettableFuture settableFuture = this.f54148i;
            if (settableFuture != null) {
                settableFuture.mo57356n((Object) null);
            }
            this.f54147h = null;
        }
    }
}

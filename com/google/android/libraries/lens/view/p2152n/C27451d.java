package com.google.android.libraries.lens.view.p2152n;

import com.google.common.p4526f.p4527a.C58970a;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.libraries.lens.view.n.d */
/* compiled from: PG */
public final /* synthetic */ class C27451d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27456i f75098a;

    /* renamed from: b */
    public final /* synthetic */ String f75099b;

    /* renamed from: c */
    public final /* synthetic */ ByteBuffer f75100c;

    /* renamed from: d */
    public final /* synthetic */ int f75101d;

    public /* synthetic */ C27451d(C27456i iVar, String str, ByteBuffer byteBuffer, int i) {
        this.f75098a = iVar;
        this.f75099b = str;
        this.f75100c = byteBuffer;
        this.f75101d = i;
    }

    public final void run() {
        FileChannel channel;
        C27456i iVar = this.f75098a;
        String str = this.f75099b;
        ByteBuffer byteBuffer = this.f75100c;
        int i = this.f75101d;
        try {
            channel = new FileOutputStream(str).getChannel();
            channel.write(byteBuffer);
            ((C58970a) ((C58970a) C27456i.f75108a.mo56224b()).mo56372aa(49296)).mo56360M("Wrote buffer %d to %s (%d/%d)", Integer.valueOf(i), str, Long.valueOf(iVar.mo32988b() + 1), Integer.valueOf(iVar.f75115h.size()));
            if (channel != null) {
                channel.close();
                return;
            }
            return;
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) C27456i.f75108a.mo56225c()).mo56382g(e)).mo56372aa(49297)).mo56360M("Failed to write buffer %d to %s (%d/%d)", Integer.valueOf(i), str, Long.valueOf(iVar.mo32988b() + 1), Integer.valueOf(iVar.f75115h.size()));
            return;
        } catch (Throwable th) {
            C27448a.m51109a(th, th);
        }
        throw th;
    }
}

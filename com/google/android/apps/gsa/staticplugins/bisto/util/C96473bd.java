package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.bd */
/* compiled from: PG */
final class C96473bd {

    /* renamed from: a */
    final AtomicBoolean f269897a = new AtomicBoolean(false);

    /* renamed from: b */
    final ParcelFileDescriptor f269898b;

    /* renamed from: c */
    final BufferedOutputStream f269899c;

    /* renamed from: d */
    final ParcelFileDescriptor.AutoCloseOutputStream f269900d;

    /* renamed from: e */
    ByteBuffer f269901e;

    /* renamed from: f */
    final Uri f269902f;

    /* renamed from: g */
    final AtomicInteger f269903g;

    /* renamed from: h */
    final AtomicBoolean f269904h = new AtomicBoolean(false);

    public C96473bd(ByteBuffer byteBuffer, Uri uri, boolean z) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        this.f269898b = createPipe[0];
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
        this.f269900d = autoCloseOutputStream;
        if (z) {
            this.f269899c = new BufferedOutputStream(autoCloseOutputStream, 512);
        } else {
            this.f269899c = new BufferedOutputStream(autoCloseOutputStream);
        }
        this.f269901e = byteBuffer;
        this.f269902f = uri;
        this.f269903g = new AtomicInteger(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo90166a() {
        C58976aa aaVar = C58975e.f156826a;
        try {
            this.f269899c.close();
        } catch (IOException e) {
            C59104x d = StreamedMessageContentProvider.f269806a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            ((C59052c) ((C59052c) d).mo56372aa(17192)).mo56354G("Cannot close outputStream.e=%s, uri=%s", e.getMessage(), this.f269902f);
        }
        try {
            this.f269900d.close();
        } catch (IOException e2) {
            C59104x d2 = StreamedMessageContentProvider.f269806a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "StreamedMessageCP");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(17191)).mo56386p("Cannot close unbufferedOutputStream.");
        }
    }
}

package com.google.frameworks.client.data.android;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58486gv;
import java.nio.ByteBuffer;

/* renamed from: com.google.frameworks.client.data.android.ae */
/* compiled from: PG */
public final class C61363ae {

    /* renamed from: a */
    public String f165930a;

    /* renamed from: b */
    public final C58486gv f165931b = new C58486gv();

    /* renamed from: c */
    public C61364af f165932c;

    /* renamed from: d */
    public boolean f165933d = true;

    /* renamed from: e */
    public String f165934e;

    /* renamed from: f */
    public boolean f165935f = false;

    /* renamed from: b */
    public final void mo57933b(String str) {
        boolean z = true;
        if (!str.equals("GET") && !str.equals("HEAD") && !str.equals("DELETE") && !str.equals("POST") && !str.equals("PUT")) {
            z = false;
        }
        C58838bb.m90883r(z);
        this.f165934e = str;
    }

    /* renamed from: a */
    public final void mo57932a(C61362ad adVar, String str) {
        adVar.getClass();
        str.getClass();
        this.f165931b.mo55419c(adVar, str);
    }

    /* renamed from: c */
    public final void mo57934c(String str, ByteBuffer byteBuffer) {
        str.getClass();
        byteBuffer.getClass();
        boolean z = true;
        if (!byteBuffer.isDirect() && byteBuffer.isReadOnly()) {
            z = false;
        }
        C58838bb.m90884s(z, "Post body cannot be a ByteBuffer that is non-direct and readonly");
        this.f165932c = new C61364af(str, byteBuffer);
    }
}

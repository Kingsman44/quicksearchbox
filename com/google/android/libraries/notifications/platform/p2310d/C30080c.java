package com.google.android.libraries.notifications.platform.p2310d;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.libraries.notifications.platform.d.c */
/* compiled from: PG */
public final class C30080c extends C30086i {

    /* renamed from: a */
    public final URL f81402a;

    /* renamed from: b */
    public final String f81403b;

    /* renamed from: c */
    public final Map f81404c;

    /* renamed from: d */
    public final byte[] f81405d;

    public C30080c(URL url, String str, Map map, byte[] bArr) {
        this.f81402a = url;
        this.f81403b = str;
        this.f81404c = map;
        this.f81405d = bArr;
    }

    /* renamed from: a */
    public final String mo35463a() {
        return this.f81403b;
    }

    /* renamed from: b */
    public final URL mo35464b() {
        return this.f81402a;
    }

    /* renamed from: c */
    public final Map mo35465c() {
        return this.f81404c;
    }

    /* renamed from: d */
    public final byte[] mo35466d() {
        return this.f81405d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30086i) {
            C30086i iVar = (C30086i) obj;
            if (this.f81402a.equals(iVar.mo35464b()) && ((str = this.f81403b) != null ? str.equals(iVar.mo35463a()) : iVar.mo35463a() == null) && this.f81404c.equals(iVar.mo35465c())) {
                if (Arrays.equals(this.f81405d, iVar instanceof C30080c ? ((C30080c) iVar).f81405d : iVar.mo35466d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f81402a.hashCode() ^ 1000003) * 1000003;
        String str = this.f81403b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f81404c.hashCode()) * 1000003) ^ Arrays.hashCode(this.f81405d);
    }

    public final String toString() {
        String obj = this.f81402a.toString();
        String str = this.f81403b;
        String obj2 = this.f81404c.toString();
        String arrays = Arrays.toString(this.f81405d);
        return "GnpHttpRequest{url=" + obj + ", contentType=" + str + ", headers=" + obj2 + ", body=" + arrays + "}";
    }
}

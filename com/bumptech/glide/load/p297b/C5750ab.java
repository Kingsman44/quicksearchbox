package com.bumptech.glide.load.p297b;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.p291h.C5630q;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.ab */
/* compiled from: PG */
public final class C5750ab implements C5955n {

    /* renamed from: b */
    public URL f17320b;

    /* renamed from: c */
    private final C5751ac f17321c;

    /* renamed from: d */
    private final URL f17322d;

    /* renamed from: e */
    private final String f17323e;

    /* renamed from: f */
    private String f17324f;

    /* renamed from: g */
    private volatile byte[] f17325g;

    /* renamed from: h */
    private int f17326h;

    public C5750ab(String str, C5751ac acVar) {
        this.f17322d = null;
        C5630q.m14605b(str);
        this.f17323e = str;
        C5630q.m14607d(acVar, "Argument must not be null");
        this.f17321c = acVar;
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        messageDigest.update(mo12252e());
    }

    /* renamed from: b */
    public final String mo12249b() {
        String str = this.f17323e;
        if (str != null) {
            return str;
        }
        URL url = this.f17322d;
        C5630q.m14607d(url, "Argument must not be null");
        return url.toString();
    }

    /* renamed from: c */
    public final String mo12250c() {
        if (TextUtils.isEmpty(this.f17324f)) {
            String str = this.f17323e;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f17322d;
                C5630q.m14607d(url, "Argument must not be null");
                str = url.toString();
            }
            this.f17324f = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f17324f;
    }

    /* renamed from: d */
    public final Map mo12251d() {
        C5751ac acVar = this.f17321c;
        C5755ag agVar = (C5755ag) acVar;
        if (agVar.f17335c == null) {
            synchronized (acVar) {
                if (((C5755ag) acVar).f17335c == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((C5755ag) acVar).f17334b.entrySet()) {
                        List list = (List) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String a = ((C5752ad) list.get(i)).mo12254a();
                            if (!TextUtils.isEmpty(a)) {
                                sb.append(a);
                                if (i != list.size() - 1) {
                                    sb.append(',');
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        if (!TextUtils.isEmpty(sb2)) {
                            hashMap.put((String) entry.getKey(), sb2);
                        }
                    }
                    ((C5755ag) acVar).f17335c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return agVar.f17335c;
    }

    /* renamed from: e */
    public final byte[] mo12252e() {
        if (this.f17325g == null) {
            this.f17325g = mo12249b().getBytes(f17613a);
        }
        return this.f17325g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5750ab) {
            C5750ab abVar = (C5750ab) obj;
            if (!mo12249b().equals(abVar.mo12249b()) || !this.f17321c.equals(abVar.f17321c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17326h;
        if (i != 0) {
            return i;
        }
        int hashCode = mo12249b().hashCode();
        this.f17326h = hashCode;
        int hashCode2 = (hashCode * 31) + this.f17321c.hashCode();
        this.f17326h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return mo12249b();
    }

    public C5750ab(URL url, C5751ac acVar) {
        C5630q.m14607d(url, "Argument must not be null");
        this.f17322d = url;
        this.f17323e = null;
        C5630q.m14607d(acVar, "Argument must not be null");
        this.f17321c = acVar;
    }
}

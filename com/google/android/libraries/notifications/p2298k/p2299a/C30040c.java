package com.google.android.libraries.notifications.p2298k.p2299a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.notifications.p2266c.C29783b;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2298k.C30042b;
import com.google.android.libraries.notifications.p2298k.C30043c;
import com.google.android.libraries.notifications.p2298k.C30044d;
import kotlinx.coroutines.C71803m;
import p5462h.C69677g;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.k.a.c */
/* compiled from: PG */
public final class C30040c {

    /* renamed from: a */
    public final Context f81285a;

    /* renamed from: b */
    public final C29783b f81286b;

    /* renamed from: c */
    public final C30044d f81287c;

    /* renamed from: d */
    public final C29835a f81288d;

    /* renamed from: e */
    private final C69585o f81289e;

    /* renamed from: f */
    private final String f81290f;

    /* renamed from: g */
    private final int f81291g;

    public C30040c(Context context, C69585o oVar, C29783b bVar, C29835a aVar, C30044d dVar, String str, int i) {
        this.f81285a = context;
        this.f81289e = oVar;
        this.f81286b = bVar;
        this.f81288d = aVar;
        this.f81287c = dVar;
        this.f81290f = str;
        this.f81291g = i;
    }

    /* renamed from: a */
    public final int mo35373a() {
        return this.f81291g;
    }

    /* renamed from: b */
    public final long mo35374b() {
        return this.f81287c.mo35166a();
    }

    /* renamed from: c */
    public final Long mo35375c() {
        C30042b c = this.f81287c.mo35168c();
        if (c != null) {
            return Long.valueOf(c.mo35382a());
        }
        return null;
    }

    /* renamed from: d */
    public final Object mo35376d(Bundle bundle, C69577g gVar) {
        return C71803m.m105040a(this.f81289e, new C30039b(this, bundle, (C69577g) null), gVar);
    }

    /* renamed from: e */
    public final String mo35377e() {
        return this.f81290f;
    }

    /* renamed from: f */
    public final boolean mo35378f() {
        return this.f81287c.mo35171f();
    }

    /* renamed from: g */
    public final int mo35379g() {
        int b;
        C30042b c = this.f81287c.mo35168c();
        if (c == null || (b = c.mo35383b()) == 0) {
            return 0;
        }
        C30043c cVar = C30043c.NONE;
        return b + -1 != 0 ? 2 : 1;
    }

    /* renamed from: h */
    public final int mo35380h() {
        C30043c d = this.f81287c.mo35169d();
        C69664n.m101060f(d, "wrappedChimeTask.networkRequirementType");
        C69664n.m101061g(d, "<this>");
        C30043c cVar = C30043c.NONE;
        int ordinal = d.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new C69677g();
    }
}

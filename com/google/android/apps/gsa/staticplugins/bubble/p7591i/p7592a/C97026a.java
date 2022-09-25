package com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a;

import android.net.Uri;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7593b.C97037c;
import com.google.common.base.C58824ao;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.i.a.a */
/* compiled from: PG */
public abstract class C97026a implements C97033h {

    /* renamed from: a */
    public boolean f271152a = false;

    /* renamed from: b */
    private final C85923cq f271153b;

    /* renamed from: c */
    private final C97037c f271154c;

    public C97026a(C85923cq cqVar, C97037c cVar) {
        this.f271153b = cqVar;
        this.f271154c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo90378a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo90379b();

    /* renamed from: c */
    public final Uri mo90398d(MessageLite messageLite) {
        String str;
        C97030e eVar = new C97030e(this.f271153b.mo83212j(), this.f271153b.mo83211i(), mo90378a());
        eVar.f271159b.mo55429h(Uri.encode(mo90379b()), Base64.encodeToString(messageLite.toByteArray(), 10));
        eVar.f271159b.mo55429h(Uri.encode("_fmt"), Uri.encode("pb"));
        eVar.mo90400c("hl", this.f271154c.mo90403c());
        eVar.mo90400c("gl", this.f271154c.mo90402b());
        if (this.f271152a) {
            eVar.mo90400c("p3", "1");
        }
        String str2 = "&";
        C58827ar arVar = new C58827ar(str2);
        C58824ao aoVar = new C58824ao(arVar, arVar);
        String d = eVar.f271161d.isEmpty() ? null : new C58827ar(str2).mo56097d(eVar.f271161d);
        String b = C97030e.m160603b("async", C97030e.m160602a(eVar.f271159b.mo55427f(false)));
        Object[] objArr = new Object[1];
        C58495hd f = eVar.f271160c.mo55427f(false);
        if (f.isEmpty()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = C97030e.m160602a(f);
        }
        objArr[0] = C97030e.m160603b("plugin", str);
        String d2 = aoVar.mo56097d(new C58825ap(objArr, d, b));
        if (!d2.isEmpty()) {
            if (true != eVar.f271162e) {
                str2 = "?";
            }
            d2 = str2.concat(d2);
        }
        return Uri.parse(eVar.f271158a.build().toString().concat(d2));
    }
}

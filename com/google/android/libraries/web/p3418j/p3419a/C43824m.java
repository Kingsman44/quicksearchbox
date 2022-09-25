package com.google.android.libraries.web.p3418j.p3419a;

import com.google.android.libraries.web.lifecycle.C43878b;
import com.google.android.libraries.web.p3418j.C43838c;
import com.google.android.libraries.web.p3418j.C43839d;
import com.google.android.libraries.web.p3418j.C43840e;
import com.google.android.libraries.web.p3418j.C43843h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.j.a.m */
/* compiled from: PG */
public final class C43824m implements C43840e, C43839d {

    /* renamed from: f */
    private static final C59071e f114247f = C59071e.m91332i("com.google.android.libraries.web.j.a.m");

    /* renamed from: a */
    public final String f114248a;

    /* renamed from: b */
    public final C43843h f114249b;

    /* renamed from: c */
    public final Map f114250c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Map f114251d = new ConcurrentHashMap();

    /* renamed from: e */
    public volatile C43840e f114252e;

    /* renamed from: g */
    private final C43833v f114253g;

    private C43824m(String str, C43843h hVar, C43833v vVar) {
        this.f114248a = str;
        this.f114249b = hVar;
        this.f114253g = vVar;
    }

    /* renamed from: e */
    static C43824m m77350e(String str, C43843h hVar, C43833v vVar, C43878b bVar) {
        C43824m mVar = new C43824m(str, hVar, vVar);
        Objects.requireNonNull(mVar);
        bVar.mo46770d(new C43812a(mVar));
        return mVar;
    }

    /* renamed from: a */
    public final void mo46838a(Object obj, C43838c cVar) {
        ((C59052c) ((C59052c) f114247f.mo56226d()).mo56372aa(54168)).mo56386p("ChildDelegatingWebStore#addListener should normally not be accessed directly.");
        this.f114250c.put(obj, cVar);
    }

    /* renamed from: b */
    public final void mo46839b(Object obj) {
        this.f114250c.remove(obj);
        this.f114251d.remove(obj);
    }

    /* renamed from: c */
    public final void mo46840c(Object obj) {
        ((C59052c) ((C59052c) f114247f.mo56226d()).mo56372aa(54169)).mo56386p("ChildDelegatingWebStore#set should normally not be accessed directly.");
        mo46845i(obj, C43821j.f114243a);
    }

    /* renamed from: d */
    public final Object mo46841d() {
        ((C59052c) ((C59052c) f114247f.mo56226d()).mo56372aa(54167)).mo56386p("ChildDelegatingWebStore#get should normally not be accessed directly.");
        C43843h hVar = this.f114249b;
        Objects.requireNonNull(hVar);
        return mo46843g().orElseGet(new C43820i(hVar));
    }

    /* renamed from: f */
    public final Optional mo46842f() {
        return Optional.ofNullable(this.f114252e).flatMap(C43819h.f114241a);
    }

    /* renamed from: g */
    public final Optional mo46843g() {
        Optional flatMap = Optional.ofNullable(this.f114252e).flatMap(C43817f.f114239a);
        C43833v vVar = this.f114253g;
        Objects.requireNonNull(vVar);
        return flatMap.map(new C43818g(vVar));
    }

    /* renamed from: h */
    public final void mo46844h(Object obj, C43823l lVar) {
        this.f114251d.put(obj, lVar);
    }

    /* renamed from: i */
    public final void mo46845i(Object obj, Consumer consumer) {
        Optional f = mo46842f();
        if (f.isPresent()) {
            ((C43840e) f.get()).mo46840c(obj);
        } else {
            consumer.accept(obj);
        }
    }
}

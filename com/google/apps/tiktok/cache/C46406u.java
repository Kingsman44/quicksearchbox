package com.google.apps.tiktok.cache;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60934v;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.cache.u */
/* compiled from: PG */
public final class C46406u implements C46407v {

    /* renamed from: a */
    public final C46401p f121464a;

    public C46406u(C46401p pVar) {
        this.f121464a = pVar;
    }

    /* renamed from: a */
    public final C58833ax mo50383a(MessageLite messageLite) {
        C58838bb.m90866a(messageLite, "Cannot get a null key");
        return C58833ax.m90833j(this.f121464a.mo50378a(messageLite));
    }

    /* renamed from: b */
    public final C60870cx mo50342b(MessageLite messageLite) {
        C58838bb.m90866a(messageLite, "Cannot evict a null key");
        this.f121464a.mo50382e(messageLite);
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo50343c() {
        this.f121464a.mo50380c();
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final C60870cx mo50344d(MessageLite messageLite, C60870cx cxVar) {
        return C60922j.m93044g(cxVar, new C46404s(this, messageLite), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo50345e(MessageLite messageLite) {
        return C60856cj.m92900i(mo50383a(messageLite));
    }

    /* renamed from: f */
    public final C60870cx mo50346f(MessageLite messageLite, C60870cx cxVar) {
        C58838bb.m90866a(messageLite, "Cannot write to cache with a null key");
        return C60922j.m93044g(cxVar, new C46405t(this, messageLite), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo50347g(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(mo50346f((MessageLite) entry.getKey(), (C60870cx) entry.getValue()));
        }
        return C60856cj.m92894c(arrayList).mo57334a(new C60934v((Object) null), C60826bg.f164896a);
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* renamed from: h */
    public final C60870cx mo50348h(MessageLite messageLite, C58817ah ahVar) {
        C46370ah ahVar2;
        Object obj;
        Object obj2;
        int serializedSize;
        try {
            C46401p pVar = this.f121464a;
            pVar.mo50379b();
            ParcelableKeyValueStore parcelableKeyValueStore = pVar.f121458d;
            C21370a aVar = pVar.f121455a;
            synchronized (parcelableKeyValueStore.f121360a) {
                C46370ah a = parcelableKeyValueStore.mo50327a(messageLite);
                ahVar2 = null;
                if (a == null) {
                    obj = null;
                } else {
                    obj = a.f121384a;
                }
                if (a == null) {
                    obj2 = C58836b.f156633a;
                } else {
                    obj2 = C58833ax.m90834k(obj);
                }
                C46386ax axVar = (C46386ax) ahVar.apply(obj2);
                axVar.getClass();
                Object obj3 = axVar.f121417a;
                if (obj3 != null) {
                    ahVar2 = new C46370ah(obj3, aVar.mo26870b());
                    parcelableKeyValueStore.mo50329c(messageLite, ahVar2);
                } else if (obj != null) {
                    ahVar2 = new C46370ah(obj, a.f121385b);
                }
            }
            if (ahVar2 == null || (serializedSize = ahVar2.f121384a.getSerializedSize()) < 2000000) {
                return C60856cj.m92900i(C58833ax.m90833j(ahVar2));
            }
            return C60856cj.m92899h(new IllegalArgumentException(String.format(Locale.US, "Message exceeds 2MB limit. Was %s bytes", new Object[]{Integer.valueOf(serializedSize)})));
        } catch (Throwable th) {
            return C60856cj.m92899h(th);
        }
    }
}

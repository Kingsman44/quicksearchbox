package com.google.android.apps.search.assistant.verticals.ambient.p9912d.p9914b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106527a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17687a;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.protobuf.C62942bv;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.d.b.a */
/* compiled from: PG */
public final class C130602a {
    /* renamed from: a */
    public static final C106532f m212959a(C17692f fVar) {
        C106529c cVar;
        C106531e eVar;
        C106527a aVar = (C106527a) C106532f.f297078g.createBuilder();
        C17689c a = C17689c.m34968a(fVar.f50861b);
        if (a == null) {
            a = C17689c.UNSPECIFIED;
        }
        C69664n.m101060f(a, "this.headsetConnected");
        C69664n.m101061g(a, "<this>");
        C106531e eVar2 = C106531e.UNKNOWN;
        C17691e eVar3 = C17691e.UNKNOWN;
        C106529c cVar2 = C106529c.UNSPECIFIED;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            cVar = C106529c.UNSPECIFIED;
        } else if (ordinal == 1) {
            cVar = C106529c.CONNECTED;
        } else if (ordinal == 2) {
            cVar = C106529c.DISCONNECTED;
        } else {
            throw new C69677g();
        }
        aVar.copyOnWrite();
        C106532f fVar2 = (C106532f) aVar.instance;
        fVar2.f297081b = cVar.f297070d;
        fVar2.f297080a |= 1;
        C17691e a2 = C17691e.m34970a(fVar.f50862c);
        if (a2 == null) {
            a2 = C17691e.UNKNOWN;
        }
        C69664n.m101060f(a2, "this.headsetType");
        C69664n.m101061g(a2, "<this>");
        int ordinal2 = a2.ordinal();
        if (ordinal2 == 0) {
            eVar = C106531e.UNKNOWN;
        } else if (ordinal2 == 1) {
            eVar = C106531e.WIRED;
        } else if (ordinal2 == 2) {
            eVar = C106531e.GENERIC_BLUETOOTH;
        } else if (ordinal2 == 3) {
            eVar = C106531e.CAR_BLUETOOTH;
        } else {
            throw new C69677g();
        }
        aVar.copyOnWrite();
        C106532f fVar3 = (C106532f) aVar.instance;
        fVar3.f297082c = eVar.f297077e;
        fVar3.f297080a |= 4;
        String str = fVar.f50863d;
        aVar.copyOnWrite();
        C106532f fVar4 = (C106532f) aVar.instance;
        str.getClass();
        fVar4.f297080a |= 8;
        fVar4.f297083d = str;
        long j = fVar.f50864e;
        aVar.copyOnWrite();
        C106532f fVar5 = (C106532f) aVar.instance;
        fVar5.f297080a |= 16;
        fVar5.f297084e = j;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "newBuilder()\n    .setHea…ltimeMillis)\n    .build()");
        return (C106532f) build;
    }

    /* renamed from: b */
    public static final C17692f m212960b(C106532f fVar) {
        C17689c cVar;
        C17691e eVar;
        C69664n.m101061g(fVar, "<this>");
        C17687a aVar = (C17687a) C17692f.f50858f.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        C106529c a = C106529c.m177304a(fVar.f297081b);
        if (a == null) {
            a = C106529c.UNSPECIFIED;
        }
        C69664n.m101060f(a, "headsetStateAgsaC.headsetConnected");
        C69664n.m101061g(a, "<this>");
        C106531e eVar2 = C106531e.UNKNOWN;
        C17691e eVar3 = C17691e.UNKNOWN;
        C17689c cVar2 = C17689c.UNSPECIFIED;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            cVar = C17689c.UNSPECIFIED;
        } else if (ordinal == 1) {
            cVar = C17689c.CONNECTED;
        } else if (ordinal == 2) {
            cVar = C17689c.DISCONNECTED;
        } else {
            throw new C69677g();
        }
        C69664n.m101061g(cVar, "value");
        aVar.copyOnWrite();
        C17692f fVar2 = (C17692f) aVar.instance;
        fVar2.f50861b = cVar.f50850d;
        fVar2.f50860a |= 1;
        C106531e a2 = C106531e.m177306a(fVar.f297082c);
        if (a2 == null) {
            a2 = C106531e.UNKNOWN;
        }
        C69664n.m101060f(a2, "headsetStateAgsaC.headsetType");
        C69664n.m101061g(a2, "<this>");
        int ordinal2 = a2.ordinal();
        if (ordinal2 == 0) {
            eVar = C17691e.UNKNOWN;
        } else if (ordinal2 == 1) {
            eVar = C17691e.WIRED;
        } else if (ordinal2 == 2) {
            eVar = C17691e.GENERIC_BLUETOOTH;
        } else if (ordinal2 == 3) {
            eVar = C17691e.CAR_BLUETOOTH;
        } else {
            throw new C69677g();
        }
        C69664n.m101061g(eVar, "value");
        aVar.copyOnWrite();
        C17692f fVar3 = (C17692f) aVar.instance;
        fVar3.f50862c = eVar.f50857e;
        fVar3.f50860a |= 4;
        String str = fVar.f297083d;
        C69664n.m101060f(str, "headsetStateAgsaC.headsetName");
        C69664n.m101061g(str, "value");
        aVar.copyOnWrite();
        C17692f fVar4 = (C17692f) aVar.instance;
        str.getClass();
        fVar4.f50860a |= 8;
        fVar4.f50863d = str;
        long j = fVar.f297084e;
        aVar.copyOnWrite();
        C17692f fVar5 = (C17692f) aVar.instance;
        fVar5.f50860a |= 16;
        fVar5.f50864e = j;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C17692f) build;
    }
}

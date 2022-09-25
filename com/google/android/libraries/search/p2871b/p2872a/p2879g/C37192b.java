package com.google.android.libraries.search.p2871b.p2872a.p2879g;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.p2871b.p2892g.C37239a;
import com.google.android.libraries.search.p2871b.p2892g.C37240b;
import com.google.android.libraries.search.p2871b.p2892g.C37242d;
import com.google.android.libraries.search.p2871b.p2892g.C37243e;
import com.google.android.libraries.search.p2871b.p2892g.C37244f;
import com.google.android.libraries.search.p2871b.p2892g.C37245g;
import com.google.android.libraries.search.p2871b.p2892g.C37246h;
import com.google.common.p4522b.C58490gz;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.b.a.g.b */
/* compiled from: PG */
public final class C37192b implements C37242d {

    /* renamed from: a */
    final Map f98401a;

    /* renamed from: b */
    final Map f98402b;

    /* renamed from: c */
    C37243e f98403c = null;

    public C37192b() {
        HashMap hashMap = new HashMap();
        this.f98401a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f98402b = hashMap2;
        hashMap.put(0, new C37245g(0, "FLOW_TYPE_UNKNOWN"));
        hashMap.put(1, new C37245g(1, "NONE"));
        hashMap.put(101, new C37245g(101, "HSI_DEEPLINK_HANDLING"));
        hashMap2.put(0, new C37244f(0, "UNKNOWN_EVENT"));
        hashMap2.put(1, new C37244f(1, "META_START_EVENT"));
        hashMap2.put(2, new C37244f(2, "META_END_EVENT"));
        hashMap2.put(101, new C37244f(101, "HSI_DEEPLINK_HANDLING_STARTED"));
        hashMap2.put(102, new C37244f(102, "HSI_DEEPLINK_HANDLING_ENDED"));
        hashMap2.put(103, new C37244f(103, "HSI_INSTALLATION_VIA_DEEPLINK_STARTED"));
        C58490gz gzVar = new C58490gz(4);
        new C58490gz(4);
        this.f98403c = new C37246h(SimpleSnackbar.LENGTH_SHORT, "hsi_android", "TNG:HSI", gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public final C37239a mo40690a(int i) {
        Map map = this.f98402b;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C37239a) this.f98402b.get(valueOf);
        }
        return new C37244f(i, String.valueOf(i));
    }

    /* renamed from: b */
    public final C37240b mo40691b(int i) {
        C37240b bVar = (C37240b) this.f98401a.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        return new C37245g(i, String.valueOf(i));
    }

    /* renamed from: c */
    public final C37243e mo40692c() {
        return this.f98403c;
    }
}

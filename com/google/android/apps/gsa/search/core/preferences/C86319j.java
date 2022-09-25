package com.google.android.apps.gsa.search.core.preferences;

import android.content.Context;
import com.google.android.apps.gsa.search.core.C85653bd;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91385o;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.base.C58837ba;
import com.google.p375ai.p378b.C7661fg;
import com.google.p375ai.p378b.C8098vl;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.j */
/* compiled from: PG */
public final class C86319j {

    /* renamed from: a */
    public final Object f233390a = new Object();

    /* renamed from: b */
    public final C68214a f233391b;

    /* renamed from: c */
    public final C85653bd f233392c;

    /* renamed from: d */
    public final Context f233393d;

    /* renamed from: e */
    public final Map f233394e = new HashMap();

    /* renamed from: f */
    private final C68214a f233395f;

    /* renamed from: g */
    private final C86127w f233396g;

    /* renamed from: h */
    private final C118561t f233397h;

    /* renamed from: i */
    private final C84486a f233398i;

    public C86319j(C68214a aVar, C86127w wVar, C68214a aVar2, C85653bd bdVar, C118561t tVar, C84486a aVar3, Context context) {
        this.f233395f = aVar;
        this.f233396g = wVar;
        this.f233391b = aVar2;
        this.f233392c = bdVar;
        this.f233397h = tVar;
        this.f233398i = aVar3;
        this.f233393d = context;
    }

    /* renamed from: a */
    public final C86317h mo80040a() {
        return mo80041b(((C86054o) this.f233395f.mo27525b()).mo79659F());
    }

    /* renamed from: b */
    public final C86317h mo80041b(String str) {
        C86317h hVar;
        C8098vl vlVar;
        String g = C58837ba.m90858g(str);
        synchronized (this.f233390a) {
            hVar = (C86317h) this.f233394e.get(g);
            if (hVar == null) {
                hVar = new C86317h(this.f233393d, this.f233396g.f232790a.mo79722a(), (C91385o) this.f233391b.mo27525b(), "now_configuration_working_" + g, this.f233397h, this.f233398i);
                C7661fg c = this.f233392c.mo79166c(g);
                if (c != null) {
                    vlVar = c.f26591e;
                    if (vlVar == null) {
                        vlVar = C8098vl.f28472k;
                    }
                } else {
                    vlVar = null;
                }
                synchronized (hVar.f233379b) {
                    if (hVar.mo80034b() == null) {
                        if (vlVar != null) {
                            hVar.mo80035c(vlVar);
                        }
                    }
                }
                this.f233394e.put(g, hVar);
            }
        }
        return hVar;
    }
}

package com.google.android.apps.search.assistant.verticals.ambient.smartspace.tips.configuration;

import android.content.Context;
import com.google.android.libraries.p11007ah.p11008a.p11009a.C147584a;
import com.google.android.libraries.p11007ah.p11008a.p11009a.C147589f;
import com.google.apps.tiktok.inject.C47266f;

/* compiled from: PG */
public final class SmartspaceTipsGateway extends C147584a {

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.tips.configuration.SmartspaceTipsGateway$a */
    /* compiled from: PG */
    public interface C131675a {
        /* renamed from: rI */
        boolean mo110255rI();

        /* renamed from: rJ */
        boolean mo110256rJ();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C147589f mo110252a(String str) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C131675a aVar = (C131675a) C47266f.m84076a(context, C131675a.class);
        return ((!str.equals("tips_smartspace_live_space_2") || !aVar.mo110255rI()) && (!str.equals("tips_smartspace_live_space_3") || !aVar.mo110256rJ())) ? C131677b.f359777a : C131676a.f359776a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C131678c mo110253b() {
        return C131678c.f359778a;
    }

    public final boolean onCreate() {
        return false;
    }
}

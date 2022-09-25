package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.common.base.C58817ah;
import java.util.Collections;

/* renamed from: com.google.apps.tiktok.account.data.manager.h */
/* compiled from: PG */
public final /* synthetic */ class C46300h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f121284a;

    /* renamed from: b */
    public final /* synthetic */ String f121285b;

    public /* synthetic */ C46300h(String str, String str2) {
        this.f121284a = str;
        this.f121285b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f121284a;
        String str2 = this.f121285b;
        for (C46227h hVar : Collections.unmodifiableMap(((C46222c) obj).f121177c).values()) {
            C46215j jVar = hVar.f121187c;
            if (jVar == null) {
                jVar = C46215j.f121154k;
            }
            if (jVar.f121165j.equals(str)) {
                C46215j jVar2 = hVar.f121187c;
                if (jVar2 == null) {
                    jVar2 = C46215j.f121154k;
                }
                if (jVar2.f121157b.equals(str2)) {
                    return AccountId.m82057b(hVar.f121186b);
                }
            }
        }
        throw new C46167as("No account is found for ".concat(str));
    }
}

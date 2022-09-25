package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46161am;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58526ih;
import java.util.Collections;

/* renamed from: com.google.apps.tiktok.account.data.manager.a */
/* compiled from: PG */
public final /* synthetic */ class C46219a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C46219a f121171a = new C46219a();

    private /* synthetic */ C46219a() {
    }

    public final Object apply(Object obj) {
        C58526ih ihVar = new C58526ih();
        for (C46227h hVar : Collections.unmodifiableMap(((C46222c) obj).f121177c).values()) {
            int a = C46161am.m82384a(hVar.f121188d);
            if (a != 0 && a == 2) {
                ihVar.mo55373c(AccountId.m82057b(hVar.f121186b));
            }
        }
        return ihVar.mo55486f();
    }
}

package com.google.android.apps.gsa.speech.p7270c;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.speech.c.b */
/* compiled from: PG */
public final class C92219b implements C58881cr {

    /* renamed from: a */
    private final C68214a f257099a;

    public C92219b(C68214a aVar) {
        this.f257099a = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        Bundle bundle = ((C87541c) this.f257099a.mo27525b()).mo81646h().f252786y;
        ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("android.opa.extra.HINTED_PHRASES") : null;
        if (stringArrayList != null) {
            return stringArrayList;
        }
        return Collections.emptyList();
    }
}

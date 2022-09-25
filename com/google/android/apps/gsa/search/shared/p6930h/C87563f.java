package com.google.android.apps.gsa.search.shared.p6930h;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.libraries.logging.C28294l;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.apps.gsa.search.shared.h.f */
/* compiled from: PG */
public final class C87563f {

    /* renamed from: a */
    private final C58833ax f236496a;

    public C87563f(C58833ax axVar) {
        this.f236496a = axVar;
    }

    /* renamed from: a */
    public static Bundle m142219a(Bundle bundle, String str, byte[] bArr) {
        C87565h hVar = new C87565h(bundle);
        if (str != null) {
            hVar.f236571q = str;
        }
        if (bArr != null) {
            hVar.f236569o = bArr;
        }
        return hVar.mo81685a();
    }

    /* renamed from: b */
    public static Bundle m142220b(String str) {
        C87565h hVar = new C87565h();
        hVar.f236560f = 1;
        hVar.f236497A = true;
        hVar.f236568n = str;
        hVar.f236572r = QueryTriggerType.OPA_HQ_SUGGESTION_CHIP;
        hVar.f236509M = true;
        hVar.f236543an = true;
        return hVar.mo81685a();
    }

    /* renamed from: c */
    public final void mo81683c(Context context, Bundle bundle) {
        ((C87568k) this.f236496a.mo56107c()).mo81689c(context, bundle, 335544320);
    }

    /* renamed from: d */
    public final void mo81684d(Context context, String str, C60214n nVar) {
        mo81683c(context, m142219a(m142220b(str), nVar != null ? C28294l.m52913c(nVar) : null, (byte[]) null));
    }
}

package com.google.android.material.bottomnavigation;

import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import com.google.android.material.internal.C44739bk;
import com.google.android.material.internal.C44740bl;

/* renamed from: com.google.android.material.bottomnavigation.c */
/* compiled from: PG */
final class C44547c implements C44739bk {
    /* renamed from: a */
    public final void mo34121a(View view, C2082cp cpVar, C44740bl blVar) {
        blVar.f116605d += cpVar.mo5239a();
        int f = C2043bi.m5577f(view);
        int b = cpVar.mo5240b();
        int c = cpVar.mo5241c();
        blVar.f116602a += f == 1 ? c : b;
        int i = blVar.f116604c;
        if (f != 1) {
            b = c;
        }
        blVar.f116604c = i + b;
        blVar.mo48050a(view);
    }
}

package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.widget.CompoundButton;
import com.google.p4715m.p4716a.p4720b.p4721a.C62678f;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.j */
/* compiled from: PG */
public final /* synthetic */ class C110380j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C110381k f307629a;

    /* renamed from: b */
    public final /* synthetic */ C62678f f307630b;

    public /* synthetic */ C110380j(C110381k kVar, C62678f fVar) {
        this.f307629a = kVar;
        this.f307630b = fVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C110381k kVar = this.f307629a;
        C62678f fVar = this.f307630b;
        C110370cb cbVar = kVar.f307642k;
        if (z) {
            cbVar.mo98600a(fVar);
            return;
        }
        Set set = (Set) cbVar.f307611c.mo3842a();
        set.getClass();
        set.remove(C110312a.m183698a(fVar));
        cbVar.f307611c.mo5708l(set);
    }
}

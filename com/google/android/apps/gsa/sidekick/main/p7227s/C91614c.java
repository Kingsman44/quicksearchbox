package com.google.android.apps.gsa.sidekick.main.p7227s;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.google.android.apps.gsa.search.shared.p6941ui.C88526f;
import com.google.android.apps.gsa.search.shared.p6941ui.C88528h;
import com.google.android.apps.gsa.search.shared.p6941ui.C88529i;
import com.google.android.apps.gsa.search.shared.p6941ui.C88530j;

/* renamed from: com.google.android.apps.gsa.sidekick.main.s.c */
/* compiled from: PG */
public final class C91614c extends DialogFragment {

    /* renamed from: a */
    private C88528h f255530a;

    /* renamed from: b */
    private C91612b f255531b;

    /* renamed from: c */
    private int f255532c;

    /* renamed from: d */
    private String f255533d;

    /* renamed from: a */
    public static C91614c m149881a(C91612b bVar, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("TITLE_RES_ID_KEY", i);
        bundle.putString("LOCATION_STRING_KEY", str);
        C91614c cVar = new C91614c();
        cVar.setArguments(bundle);
        cVar.setTargetFragment(bVar, 0);
        return cVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (bundle == null) {
            this.f255532c = getArguments().getInt("TITLE_RES_ID_KEY");
            this.f255533d = getArguments().getString("LOCATION_STRING_KEY");
        } else {
            this.f255532c = bundle.getInt("TITLE_RES_ID_KEY");
            this.f255533d = bundle.getString("LOCATION_STRING_KEY");
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C91612b) {
            this.f255531b = (C91612b) targetFragment;
        }
        C88528h hVar = new C88528h(new ContextThemeWrapper(getContext(), 2132150729), this.f255531b.f255529b);
        this.f255530a = hVar;
        hVar.setTitle(this.f255532c);
        C88528h hVar2 = this.f255530a;
        C91617f fVar = this.f255531b.f255529b.f255538c;
        C88530j jVar = hVar2.f239257c;
        fVar.registerDataSetObserver(new C88529i(jVar));
        jVar.f239263b.setAdapter(fVar);
        jVar.f239266e.mo86001a(jVar.f239262a.getText().toString());
        hVar2.f239256b.setOnItemClickListener(new C88526f(hVar2));
        this.f255530a.getWindow().setSoftInputMode(5);
        String str = this.f255533d;
        if (str != null) {
            C88530j jVar2 = this.f255530a.f239257c;
            jVar2.f239262a.setText(str);
            jVar2.f239262a.setSelectAllOnFocus(true);
            jVar2.f239262a.setOnFocusChangeListener(jVar2);
            jVar2.f239265d = true;
            if (!TextUtils.isEmpty(str)) {
                jVar2.f239262a.setSelection(str.length());
                jVar2.f239262a.selectAll();
            }
        }
        return this.f255530a;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f255531b.f255529b.f255538c.clear();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("TITLE_RES_ID_KEY", this.f255532c);
        bundle.putString("LOCATION_STRING_KEY", this.f255530a.f239257c.f239262a.getText().toString());
    }
}

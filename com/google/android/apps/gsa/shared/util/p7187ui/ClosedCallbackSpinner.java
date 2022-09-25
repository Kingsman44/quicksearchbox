package com.google.android.apps.gsa.shared.util.p7187ui;

import android.content.Context;
import android.support.p033v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.widget.AdapterView;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87625ad;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87633g;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59673c;
import com.google.common.p4552o.C59712d;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62940bt;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.ClosedCallbackSpinner */
/* compiled from: PG */
public final class ClosedCallbackSpinner extends AppCompatSpinner {

    /* renamed from: e */
    public C87633g f254391e;

    /* renamed from: f */
    private boolean f254392f = false;

    /* renamed from: g */
    private int f254393g = -1;

    public ClosedCallbackSpinner(Context context) {
        super(context);
    }

    /* renamed from: c */
    public final void mo85364c() {
        if (this.f254392f) {
            super.onDetachedFromWindow();
            mo85365d();
        }
    }

    /* renamed from: d */
    public final void mo85365d() {
        this.f254392f = false;
        C87633g gVar = this.f254391e;
        if (gVar != null) {
            C87625ad adVar = gVar.f236891a;
            if (adVar.f236821aX) {
                adVar.f236821aX = false;
                adVar.mo81770C(QueryTriggerType.AGA_PROGRAMMATIC_LANGUAGE_SWITCHER_CLOSED);
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f254392f && z) {
            mo85365d();
        }
    }

    public final boolean performClick() {
        this.f254392f = true;
        C87633g gVar = this.f254391e;
        if (gVar != null) {
            C87625ad adVar = gVar.f236891a;
            adVar.f236817aT = false;
            adVar.f236822aY = true;
            C87673aa aaVar = adVar.f236773C;
            if (aaVar != null) {
                aaVar.mo81937i(new C88489j(C87739bu.LANGUAGE_SWITCHER_TAPPED).mo82013a());
            }
            C87625ad adVar2 = gVar.f236891a;
            adVar2.f236821aX = true;
            SearchPlate searchPlate = adVar2.f236778H;
            C58485gu j = C58485gu.m89842j(adVar2.f236813aP.f240881d);
            String c = gVar.f236891a.f236813aP.mo82798c();
            C89949q.m146521e(C28285c.m52882i(searchPlate.f240747t, 5, (Integer) null), false);
            C28292j jVar = new C28292j(126859);
            jVar.mo33794h(1);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < j.size(); i++) {
                C28292j jVar2 = new C28292j(117472);
                aqp aqp = jVar2.f76974b;
                aqp.copyOnWrite();
                aqs aqs = (aqs) aqp.instance;
                aqs aqs2 = aqs.f159780k;
                aqs.f159782a |= 2;
                aqs.f159784c = i;
                C62940bt btVar = C59712d.f160228e;
                C59673c cVar = (C59673c) C59712d.f160227d.createBuilder();
                cVar.copyOnWrite();
                C59712d dVar = (C59712d) cVar.instance;
                c.getClass();
                dVar.f160230a |= 1;
                dVar.f160231b = c;
                String str = (String) j.get(i);
                cVar.copyOnWrite();
                C59712d dVar2 = (C59712d) cVar.instance;
                str.getClass();
                dVar2.f160230a |= 2;
                dVar2.f160232c = str;
                jVar2.f76974b.mo58885m(btVar, (C59712d) cVar.build());
                jVar2.mo33795i(5);
                jVar2.mo33794h(1);
                arrayList.add(C28293k.m52908e(jVar2, new C28293k[0]));
            }
            C28293k d = C28293k.m52907d(jVar, arrayList);
            C89949q.m146521e(C28285c.m52875b(d, 126629), false);
            adVar2.f236819aV = d;
        }
        return super.performClick();
    }

    public final void setSelection(int i) {
        AdapterView.OnItemSelectedListener onItemSelectedListener;
        super.setSelection(i);
        if (i == this.f254393g && (onItemSelectedListener = getOnItemSelectedListener()) != null) {
            onItemSelectedListener.onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
        this.f254392f = false;
        this.f254393g = i;
    }

    public ClosedCallbackSpinner(Context context, int i) {
        super(context, i);
    }

    public ClosedCallbackSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClosedCallbackSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ClosedCallbackSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void setSelection(int i, boolean z) {
        AdapterView.OnItemSelectedListener onItemSelectedListener;
        super.setSelection(i, z);
        if (i == this.f254393g && (onItemSelectedListener = getOnItemSelectedListener()) != null) {
            onItemSelectedListener.onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
        this.f254392f = false;
        this.f254393g = i;
    }
}

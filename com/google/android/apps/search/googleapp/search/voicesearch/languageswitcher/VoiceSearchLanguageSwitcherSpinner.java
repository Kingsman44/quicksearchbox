package com.google.android.apps.search.googleapp.search.voicesearch.languageswitcher;

import android.content.Context;
import android.support.p033v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AdapterView;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.voicesearch.C138858q;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class VoiceSearchLanguageSwitcherSpinner extends AppCompatSpinner {

    /* renamed from: e */
    public boolean f377556e = false;

    /* renamed from: f */
    public C138858q f377557f;

    /* renamed from: g */
    private int f377558g = -1;

    public VoiceSearchLanguageSwitcherSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            return true;
        }
        if (actionMasked != 1 || this.f377556e) {
            return false;
        }
        performClick();
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        C138858q qVar;
        super.onWindowFocusChanged(z);
        if (z && this.f377556e && (qVar = this.f377557f) != null) {
            this.f377556e = false;
            C139708c cVar = qVar.f377690a.f377718t;
            C37258g gVar = C37182a.f98094gH;
            C69664n.m101060f(gVar, "GOOGLEAPP_VOICE_SEARCH_LANGUAGE_SWITCHER_CLOSED");
            cVar.mo115177d(gVar);
            qVar.f377690a.f377716r.mo114519b(false);
        }
    }

    public final boolean performClick() {
        if (!this.f377556e) {
            this.f377556e = true;
            super.performClick();
            C138858q qVar = this.f377557f;
            if (qVar != null) {
                qVar.f377690a.f377707i.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(qVar.f377690a.mo114603a()));
                C139708c cVar = qVar.f377690a.f377718t;
                C37258g gVar = C37182a.f98093gG;
                C69664n.m101060f(gVar, "GOOGLEAPP_VOICE_SEARCH_LANGUAGE_SWITCHER_TAP");
                cVar.mo115177d(gVar);
                qVar.f377690a.mo114608i(6);
            }
        }
        return true;
    }

    public final void setSelection(int i) {
        super.setSelection(i);
        int i2 = this.f377558g;
        int selectedItemPosition = getSelectedItemPosition();
        AdapterView.OnItemSelectedListener onItemSelectedListener = getOnItemSelectedListener();
        if (i2 == selectedItemPosition && onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
        this.f377558g = i;
    }

    public final void setSelection(int i, boolean z) {
        super.setSelection(i, z);
        int i2 = this.f377558g;
        int selectedItemPosition = getSelectedItemPosition();
        AdapterView.OnItemSelectedListener onItemSelectedListener = getOnItemSelectedListener();
        if (i2 == selectedItemPosition && onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(this, getSelectedView(), i, getSelectedItemId());
        }
        this.f377558g = i;
    }
}

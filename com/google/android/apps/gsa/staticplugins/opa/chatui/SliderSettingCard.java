package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.provider.Settings;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89109c;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89111e;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.common.base.C58837ba;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* compiled from: PG */
public class SliderSettingCard extends C108375gj {

    /* renamed from: a */
    final SeekBar.OnSeekBarChangeListener f300938a = new C108409hq(this);

    /* renamed from: b */
    public int f300939b = -1;

    /* renamed from: c */
    private SeekBar f300940c;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.SliderSettingCard$a */
    /* compiled from: PG */
    public interface C108190a {
        /* renamed from: qF */
        void mo96573qF(SliderSettingCard sliderSettingCard);
    }

    public SliderSettingCard(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo96538b(C52131gj gjVar) {
        super.mo96538b(gjVar);
        if (!this.f301436m) {
            this.f300940c.setEnabled(false);
        }
        if (((C86124t) this.f301428e.mo27525b()).mo79746e(C90014bt.f247185cQ) && (gjVar.f136791a & 32) != 0) {
            String str = gjVar.f136797g;
            if (C89111e.m144950a(str) != -1) {
                this.f301431h.registerContentObserver(Settings.System.CONTENT_URI, true, this.f301429f);
            } else if (str.equals(C63490p.BRIGHTNESS_LEVEL.name())) {
                this.f301431h.registerContentObserver(Settings.System.getUriFor("screen_brightness"), false, this.f301429f);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo96539c() {
        ((C108190a) C47266f.m84076a(this.f301433j, C108190a.class)).mo96573qF(this);
    }

    /* renamed from: d */
    public final void mo96540d() {
        int i;
        Integer d;
        C89109c cVar = this.f301432i;
        int a = cVar.mo83080a();
        if (!cVar.f241558f || (d = C89111e.m144953d(cVar.mo83082c(), cVar.mo83081b(), a)) == null || !C89111e.m144954e(d)) {
            if (cVar.f241554b.mo79746e(C90014bt.f247185cQ) && !C58837ba.m90859h(cVar.f241557e)) {
                String str = cVar.f241556d;
                String str2 = cVar.f241557e;
                Integer a2 = cVar.f241555c.mo83091a(7).mo83089a(cVar.f241557e);
                if (a2 != null && C89111e.m144954e(a2)) {
                    i = a2.intValue();
                }
            }
            i = -1;
        } else {
            i = d.intValue();
        }
        this.f300939b = i;
        if (i >= 0) {
            this.f300940c.setProgress(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f300940c.setOnSeekBarChangeListener(this.f300938a);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f300940c.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        SeekBar seekBar = (SeekBar) findViewById(R.id.seek_bar);
        this.f300940c = seekBar;
        C28292j jVar = new C28292j(78036);
        jVar.mo33795i(31);
        C28295m.m52919e(seekBar, jVar);
    }

    public SliderSettingCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SliderSettingCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

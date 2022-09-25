package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89109c;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89111e;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class DiscreteSliderSettingCard extends C108375gj {

    /* renamed from: a */
    final SeekBar.OnSeekBarChangeListener f300889a = new C108254by(this);

    /* renamed from: b */
    public List f300890b;

    /* renamed from: c */
    public int f300891c;

    /* renamed from: n */
    private SeekBar f300892n;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.DiscreteSliderSettingCard$a */
    /* compiled from: PG */
    public interface C108186a {
        /* renamed from: qB */
        void mo96544qB(DiscreteSliderSettingCard discreteSliderSettingCard);
    }

    public DiscreteSliderSettingCard(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo96538b(C52131gj gjVar) {
        Cursor d;
        super.mo96538b(gjVar);
        if (!this.f301436m) {
            this.f300892n.setEnabled(false);
        }
        C89109c cVar = this.f301432i;
        ArrayList arrayList = new ArrayList();
        Uri c = C89111e.m144952c(cVar.f241556d);
        if (c == null) {
            ((C59052c) ((C59052c) C89109c.f241552a.mo56226d()).mo56372aa(10965)).mo56386p("Null uri when query setting supported values.");
        } else {
            try {
                d = cVar.mo83083d(c);
                if (d == null) {
                    cVar.f241558f = false;
                } else {
                    d.moveToPosition(0);
                    boolean equals = "0".equals(d.getString(1));
                    cVar.f241558f = equals;
                    if (equals) {
                        for (String parseFloat : d.getString(4).split(",")) {
                            arrayList.add(Float.valueOf(Float.parseFloat(parseFloat)));
                        }
                    }
                    d.close();
                }
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) C89109c.f241552a.mo56226d()).mo56372aa(10962)).mo56389s("While querying setting supported values: %s", e.getMessage());
            } catch (Throwable th) {
                if (d != null) {
                    d.close();
                }
                throw th;
            }
        }
        this.f300890b = arrayList;
        if (arrayList.size() > 1) {
            this.f300892n.setMax(this.f300890b.size() - 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo96539c() {
        ((C108186a) C47266f.m84076a(this.f301433j, C108186a.class)).mo96544qB(this);
    }

    /* renamed from: d */
    public final void mo96540d() {
        String f = this.f301432i.mo83085f(false);
        if (f != null) {
            int lastIndexOf = this.f300890b.lastIndexOf(Float.valueOf(Float.parseFloat(f)));
            this.f300891c = lastIndexOf;
            if (lastIndexOf >= 0) {
                this.f300892n.setProgress(lastIndexOf);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f300892n.setOnSeekBarChangeListener(this.f300889a);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f300892n.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f300892n = (SeekBar) findViewById(R.id.discrete_seek_bar);
    }

    public DiscreteSliderSettingCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DiscreteSliderSettingCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

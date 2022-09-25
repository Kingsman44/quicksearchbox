package com.google.android.gms.cast.framework.p10774b;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.mediarouter.app.C3772i;
import androidx.mediarouter.p175a.C3687aw;
import androidx.mediarouter.p175a.C3753z;
import com.google.android.gms.cast.framework.p10774b.p10775a.C143419b;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.b.f */
/* compiled from: PG */
public final class C143424f extends C3772i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: j */
    private static final C143566ae f388925j = new C143566ae("DeviceChooserDialog");

    /* renamed from: a */
    public C3687aw f388926a;

    /* renamed from: c */
    public C144861c f388927c;

    /* renamed from: d */
    public Runnable f388928d;

    /* renamed from: e */
    protected TextView f388929e;

    /* renamed from: f */
    protected ListView f388930f;

    /* renamed from: g */
    protected View f388931g;

    /* renamed from: h */
    protected LinearLayout f388932h;

    /* renamed from: i */
    protected LinearLayout f388933i;

    /* renamed from: k */
    private final C143422d f388934k = new C143422d(this);

    /* renamed from: l */
    private final long f388935l = C143419b.f388918a;

    /* renamed from: m */
    private final long f388936m = C143419b.f388919b;

    /* renamed from: n */
    private final long f388937n = C143419b.f388920c;

    /* renamed from: o */
    private C3753z f388938o = C3753z.f12042a;

    /* renamed from: p */
    private ArrayAdapter f388939p;

    /* renamed from: q */
    private boolean f388940q;

    /* renamed from: r */
    private long f388941r;

    /* renamed from: s */
    private Runnable f388942s;

    public C143424f(Context context) {
        super(context);
    }

    /* renamed from: n */
    private final void m232787n() {
        Runnable runnable;
        C143566ae aeVar = f388925j;
        aeVar.mo118884b("startDiscovery", new Object[0]);
        C3687aw awVar = this.f388926a;
        if (awVar == null) {
            aeVar.mo118884b("Can't start discovery. setUpMediaRouter needs to be called first", new Object[0]);
            return;
        }
        awVar.mo7773h(this.f388938o, this.f388934k, 1);
        C144861c cVar = this.f388927c;
        if (cVar != null && (runnable = this.f388928d) != null) {
            cVar.removeCallbacks(runnable);
            this.f388927c.postDelayed(this.f388928d, this.f388936m);
        }
    }

    public final void dismiss() {
        super.dismiss();
        C144861c cVar = this.f388927c;
        if (cVar != null) {
            cVar.removeCallbacks(this.f388942s);
            this.f388927c.removeCallbacks(this.f388928d);
        }
        View view = this.f388931g;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: g */
    public final void mo7989g() {
        C3687aw awVar;
        if (this.f388940q && (awVar = this.f388926a) != null) {
            ArrayList arrayList = new ArrayList(awVar.mo7772g());
            mo7988a(arrayList);
            Collections.sort(arrayList, C143423e.f388924a);
            if (SystemClock.uptimeMillis() - this.f388941r >= this.f388935l) {
                mo118633m(arrayList);
                return;
            }
            C144861c cVar = this.f388927c;
            if (cVar != null) {
                cVar.removeMessages(1);
                C144861c cVar2 = this.f388927c;
                cVar2.sendMessageAtTime(cVar2.obtainMessage(1, arrayList), this.f388941r + this.f388935l);
            }
        }
    }

    /* renamed from: h */
    public final void mo7990h(C3753z zVar) {
        super.mo7990h(zVar);
        if (zVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.f388938o.equals(zVar)) {
            this.f388938o = zVar;
            mo118632k();
            if (this.f388940q) {
                m232787n();
            }
            mo7989g();
        }
    }

    /* renamed from: k */
    public final void mo118632k() {
        C143566ae aeVar = f388925j;
        aeVar.mo118884b("stopDiscovery", new Object[0]);
        C3687aw awVar = this.f388926a;
        if (awVar == null) {
            aeVar.mo118884b("Can't stop discovery. setUpMediaRouter needs to be called first", new Object[0]);
            return;
        }
        awVar.mo7774j(this.f388934k);
        this.f388926a.mo7773h(this.f388938o, this.f388934k, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo118633m(List list) {
        this.f388941r = SystemClock.uptimeMillis();
        this.f388939p.clear();
        this.f388939p.addAll(list);
        this.f388939p.notifyDataSetChanged();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f388940q = true;
        m232787n();
        mo7989g();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ListView listView = (ListView) mo1197b().mo1177e(R.id.mr_chooser_list);
        if (listView != null) {
            mo1197b().mo1188p(R.layout.cast_device_chooser_dialog);
            this.f388939p = (ArrayAdapter) listView.getAdapter();
            ListView listView2 = (ListView) mo1197b().mo1177e(R.id.cast_device_chooser_list);
            this.f388930f = listView2;
            if (listView2 != null) {
                listView2.setAdapter(this.f388939p);
                this.f388930f.setOnItemClickListener(listView.getOnItemClickListener());
            }
            this.f388929e = (TextView) mo1197b().mo1177e(R.id.cast_device_chooser_title);
            this.f388932h = (LinearLayout) mo1197b().mo1177e(R.id.cast_device_chooser_searching);
            this.f388933i = (LinearLayout) mo1197b().mo1177e(R.id.cast_device_chooser_zero_devices);
            TextView textView = (TextView) mo1197b().mo1177e(R.id.cast_device_chooser_learn_more);
            if (textView != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            View e = mo1197b().mo1177e(16908292);
            this.f388931g = e;
            if (!(this.f388930f == null || e == null)) {
                e.getViewTreeObserver().addOnGlobalLayoutListener(this);
                ListView listView3 = this.f388930f;
                C143919bh.m233958a(listView3);
                View view = this.f388931g;
                C143919bh.m233958a(view);
                listView3.setEmptyView(view);
            }
            this.f388942s = new C143420b(this);
        }
    }

    public final void onDetachedFromWindow() {
        this.f388940q = false;
        mo118632k();
        super.onDetachedFromWindow();
    }

    public final void onGlobalLayout() {
        View view = this.f388931g;
        if (view != null) {
            Object tag = view.getTag();
            int visibility = this.f388931g.getVisibility();
            if (tag == null || ((Integer) tag).intValue() != visibility) {
                if (visibility == 0) {
                    LinearLayout linearLayout = this.f388932h;
                    if (!(linearLayout == null || this.f388933i == null)) {
                        linearLayout.setVisibility(0);
                        LinearLayout linearLayout2 = this.f388933i;
                        C143919bh.m233958a(linearLayout2);
                        linearLayout2.setVisibility(8);
                    }
                    C144861c cVar = this.f388927c;
                    if (cVar != null) {
                        cVar.removeCallbacks(this.f388942s);
                        this.f388927c.postDelayed(this.f388942s, this.f388937n);
                    }
                }
                View view2 = this.f388931g;
                C143919bh.m233958a(view2);
                view2.setTag(Integer.valueOf(visibility));
            }
        }
    }

    public final void setTitle(int i) {
        TextView textView = this.f388929e;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.f388929e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

package com.google.android.libraries.componentview.components.p1693e;

import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.p1689c.C20219bl;
import com.google.android.libraries.componentview.components.p1689c.C20220bm;
import com.google.android.libraries.componentview.components.p1689c.C20228bu;
import com.google.android.libraries.componentview.components.p1689c.C20289ea;
import com.google.android.libraries.componentview.components.p1693e.p1695b.C20356b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.componentview.components.e.e */
/* compiled from: PG */
public final class C20361e implements C20220bm {

    /* renamed from: a */
    private final C20356b f57250a;

    /* renamed from: b */
    private final TextView f57251b;

    /* renamed from: c */
    private final String f57252c;

    /* renamed from: d */
    private final String f57253d;

    public C20361e(C20356b bVar, TextView textView, String str, String str2) {
        this.f57250a = bVar;
        this.f57251b = textView;
        this.f57252c = str;
        this.f57253d = str2;
    }

    /* renamed from: b */
    public final int mo25296b() {
        if (this.f57250a.getVisibility() == 0) {
            return this.f57250a.getHeight();
        }
        return 0;
    }

    /* renamed from: c */
    public final C20219bl mo25297c(boolean z) {
        String str;
        if (z) {
            str = this.f57253d;
        } else {
            str = this.f57252c;
        }
        TextView textView = this.f57251b;
        if (textView != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            textView.setText(str);
        }
        this.f57250a.setRotation(true != z ? 0.0f : 180.0f);
        return new C20219bl(true, C58485gu.m89845m());
    }

    /* renamed from: d */
    public final C20228bu mo25298d(boolean z) {
        return new C20289ea(z, this.f57250a, this.f57251b, this.f57252c, this.f57253d);
    }
}

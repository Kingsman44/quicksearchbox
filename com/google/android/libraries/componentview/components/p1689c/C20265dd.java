package com.google.android.libraries.componentview.components.p1689c;

import android.view.View;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20610cj;
import com.google.p4271bq.C56429h;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.c.dd */
/* compiled from: PG */
public final class C20265dd extends C20218bk {

    /* renamed from: h */
    private final List f56871h;

    /* renamed from: i */
    private final String f56872i;

    /* renamed from: j */
    private final String f56873j;

    /* renamed from: k */
    private final View f56874k;

    public C20265dd(List list, C20601ca caVar, C56429h hVar, boolean z, C20610cj cjVar, String str, String str2, String str3, View view) {
        super(caVar, hVar, z, cjVar, str);
        this.f56871h = list;
        this.f56872i = str2;
        this.f56873j = str3;
        this.f56874k = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List mo25293a() {
        return this.f56871h;
    }

    /* renamed from: c */
    public final C20219bl mo25297c(boolean z) {
        View view;
        String str;
        C20219bl c = super.mo25297c(z);
        if (c.f56782a && (view = this.f56874k) != null) {
            if (z) {
                str = this.f56873j;
            } else {
                str = this.f56872i;
            }
            view.setContentDescription(str);
        }
        return c;
    }
}

package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a */
/* compiled from: PG */
public final class C88716a implements C88788v {

    /* renamed from: a */
    private final LayoutInflater f239949a;

    /* renamed from: b */
    private boolean f239950b;

    /* renamed from: c */
    private boolean f239951c;

    /* renamed from: d */
    private FrameLayout f239952d;

    public C88716a(Context context) {
        this.f239949a = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final List mo82337a() {
        if (!this.f239951c) {
            return C58485gu.m89845m();
        }
        FrameLayout frameLayout = this.f239952d;
        frameLayout.getClass();
        return C58485gu.m89846n(frameLayout);
    }

    /* renamed from: b */
    public final void mo82338b(List list, Response response, C88709j jVar) {
        if (!list.isEmpty()) {
            jVar.getClass();
            if (jVar.f239872ab) {
                this.f239951c = true;
                if (!this.f239950b) {
                    this.f239952d = (FrameLayout) this.f239949a.inflate(R.layout.assistant_logo_view, (ViewGroup) null, false);
                    this.f239950b = true;
                    return;
                }
                return;
            }
        }
        this.f239951c = false;
    }
}

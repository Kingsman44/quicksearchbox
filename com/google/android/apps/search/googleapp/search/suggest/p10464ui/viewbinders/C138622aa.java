package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.search.suggest.C138015ag;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138049f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.aa */
/* compiled from: PG */
public final class C138622aa extends C46756m {

    /* renamed from: a */
    public final C138049f f377005a;

    /* renamed from: b */
    private final C47770dh f377006b;

    public C138622aa(C47770dh dhVar, C138049f fVar) {
        this.f377006b = dhVar;
        this.f377005a = fVar;
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        this.f377005a.f375617a++;
        return LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.googleapp_manage_activity_footer_view, viewGroup, false);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18114b(View view, Object obj) {
        C138015ag agVar = (C138015ag) obj;
        View findViewById = view.findViewById(R.id.googleapp_manage_activity_button);
        findViewById.setOnClickListener(new C47591co(this.f377006b, "Manage Actibity button click", new C138673z(this, findViewById)));
    }
}

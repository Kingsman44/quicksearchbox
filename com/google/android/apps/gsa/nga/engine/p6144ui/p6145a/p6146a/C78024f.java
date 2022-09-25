package com.google.android.apps.gsa.nga.engine.p6144ui.p6145a.p6146a;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.nga.engine.am.s.q;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78076o;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.ConfirmCancelCountDownLayout;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.MessageLayout;
import com.google.android.apps.gsa.nga.p5887c.C74745a;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.a.a.f */
/* compiled from: PG */
public final class C78024f extends Fragment {

    /* renamed from: a */
    public Locale f214874a;

    /* renamed from: b */
    public C78076o f214875b;

    /* renamed from: c */
    public q f214876c;

    /* renamed from: d */
    private StatusBarNotification f214877d;

    /* renamed from: e */
    private String f214878e;

    /* renamed from: f */
    private boolean f214879f;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C78023e eVar = (C78023e) C74745a.m120861a(getActivity());
        if (eVar != null) {
            eVar.mo72971pS(this);
            this.f214877d = (StatusBarNotification) getArguments().getParcelable("notification");
            this.f214878e = getArguments().getString("message");
            this.f214879f = getArguments().getBoolean("successful");
            this.f214874a = (Locale) getArguments().getSerializable("locale");
            return;
        }
        throw new IllegalStateException("Could not create injector for AnswerUiActivity.");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConfirmCancelCountDownLayout a = this.f214875b.mo73058a();
        MessageLayout b = this.f214875b.mo73059b();
        boolean z = this.f214879f;
        FrameLayout frameLayout = (FrameLayout) a.findViewById(R.id.confirm_cancel_content);
        frameLayout.removeAllViews();
        frameLayout.addView(b);
        ProgressBar progressBar = (ProgressBar) a.findViewById(R.id.confirm_progress_circle);
        ProgressBar progressBar2 = (ProgressBar) a.findViewById(R.id.confirm_progress_circle);
        ImageView imageView = (ImageView) a.findViewById(R.id.confirm_icon);
        ImageView imageView2 = (ImageView) a.findViewById(R.id.cancel_icon);
        View findViewById = a.findViewById(R.id.confirm_btn);
        View findViewById2 = a.findViewById(R.id.cancel_btn);
        if (z) {
            findViewById2.setVisibility(8);
            a.mo72981d(progressBar);
            a.mo72978a(imageView, R.drawable.quantum_ic_done_white_48);
        } else {
            findViewById.setVisibility(8);
            a.mo72981d(progressBar2);
            a.mo72978a(imageView2, R.drawable.quantum_ic_close_white_48);
        }
        Optional.ofNullable(this.f214877d).ifPresent(new C78021c(this, b, a));
        Optional.ofNullable(this.f214878e).ifPresent(new C78022d(b));
        return a;
    }
}

package com.google.android.youtube.player.p3561b;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.C0260w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.player.C45508d;
import com.google.android.youtube.player.C45509e;
import com.google.android.youtube.player.C45511g;

/* renamed from: com.google.android.youtube.player.b.bb */
public final class C45470bb extends C0260w {

    /* renamed from: a */
    public final C45485e f118884a = new C45485e(this, new C45486f(), C45511g.f118965v, C45508d.f118950v, C45509e.f118951b);

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f118884a.mo49647l();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f118884a.mo49650o();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f118884a.mo49650o();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f118884a.mo49648m();
        C0167am activity = getActivity();
        setStyle(2, (activity == null || !activity.isInMultiWindowMode()) ? 16973834 : 16973833);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View c = this.f118884a.mo49638c();
        c.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return c;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f118884a.mo49655u();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f118884a.mo49656v();
    }

    public final void onDetach() {
        super.onDetach();
        this.f118884a.mo49639d();
    }

    public final void onPause() {
        super.onPause();
        this.f118884a.mo49640e();
    }

    public final void onResume() {
        super.onResume();
        this.f118884a.mo49641f();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f118884a.mo49642g(bundle);
    }

    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
        }
        this.f118884a.mo49643h();
    }

    public final void onStop() {
        super.onStop();
        this.f118884a.mo49644i();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f118884a.mo49649n();
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.f118884a.mo49645j(bundle);
    }
}

package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.app.Activity;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3693c.C47599b;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3693c.C47600c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.az */
/* compiled from: PG */
public final class C13144az {

    /* renamed from: a */
    public static final C59071e f40735a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.az");

    /* renamed from: b */
    public final Fragment f40736b;

    /* renamed from: c */
    public boolean f40737c;

    /* renamed from: d */
    public volatile boolean f40738d = false;

    /* renamed from: e */
    private final C47600c f40739e;

    /* renamed from: f */
    private final float f40740f;

    /* renamed from: g */
    private final float f40741g;

    public C13144az(Fragment fragment, C47600c cVar) {
        this.f40736b = fragment;
        this.f40739e = cVar;
        TypedValue typedValue = new TypedValue();
        fragment.getResources().getValue(R.dimen.voiceplate_scroll_button_enabled, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        fragment.getResources().getValue(R.dimen.voiceplate_scroll_button_disabled, typedValue2, true);
        this.f40740f = typedValue.getFloat();
        this.f40741g = typedValue2.getFloat();
    }

    /* renamed from: b */
    private final void m29368b(boolean z) {
        float f;
        float f2;
        RecyclerView recyclerView = (RecyclerView) this.f40736b.requireView().findViewById(R.id.media_rec_content_container);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.mLayout;
        if (linearLayoutManager != null) {
            C0640fb fbVar = recyclerView.mAdapter;
            fbVar.getClass();
            int itemCount = fbVar.getItemCount();
            int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            int i = 0;
            boolean z2 = findFirstCompletelyVisibleItemPosition != 0 && !z;
            int i2 = itemCount - 1;
            if (this.f40737c) {
                View findViewById = this.f40736b.requireView().findViewById(R.id.scrollbar_up_button);
                if (z2) {
                    f = this.f40740f;
                } else {
                    f = this.f40741g;
                }
                findViewById.setAlpha(f);
                View findViewById2 = this.f40736b.requireView().findViewById(R.id.scrollbar_down_button);
                if (findLastCompletelyVisibleItemPosition < i2) {
                    f2 = this.f40740f;
                } else {
                    f2 = this.f40741g;
                }
                findViewById2.setAlpha(f2);
                return;
            }
            this.f40736b.requireView().findViewById(R.id.media_rec_prev_page).setVisibility(true != z2 ? 8 : 0);
            View findViewById3 = this.f40736b.requireView().findViewById(R.id.media_rec_next_page);
            if (findLastCompletelyVisibleItemPosition >= i2) {
                i = 8;
            }
            findViewById3.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo20927a(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i == 6) {
            if (!this.f40738d) {
                this.f40738d = true;
            } else {
                return;
            }
        }
        View requireView = this.f40736b.requireView();
        TransitionSet addTransition = new TransitionSet().setOrdering(0).addTransition(new Fade(2));
        TransitionSet addTransition2 = new TransitionSet().setOrdering(0).addTransition(new ChangeBounds());
        TransitionSet addTransition3 = new TransitionSet().setOrdering(0).addTransition(new Fade(1));
        View findViewById = this.f40736b.requireView().findViewById(R.id.scrim);
        addTransition.excludeTarget(findViewById, true);
        addTransition3.excludeTarget(findViewById, true);
        addTransition2.addTransition(new Fade(1).addTarget(findViewById)).addTransition(new Fade(2).addTarget(findViewById));
        TransitionManager.beginDelayedTransition((ViewGroup) requireView.findViewById(R.id.media_rec_plate_container), new TransitionSet().setOrdering(1).addTransition(addTransition).addTransition(addTransition2).addTransition(addTransition3).addListener(new C47599b(this.f40739e, new C13143ay(this, i), "MediaRecFragmentPeer#TransitionListener")));
        ((ViewGroup.MarginLayoutParams) requireView.findViewById(R.id.media_rec_plate_and_page_button).getLayoutParams()).bottomMargin = i == 6 ? (int) requireView.getResources().getDimension(R.dimen.media_rec_plate_margin_bottom_offscreen) : 0;
        requireView.findViewById(R.id.scrim).setVisibility(i == 6 ? 8 : 0);
        int i2 = i - 1;
        if (i2 == 1) {
            requireView.findViewById(R.id.network_offline_bar).setVisibility(0);
            ((TextView) requireView.findViewById(R.id.media_rec_header_text)).setText(R.string.aae_network_status_offline);
        } else if (i2 == 3) {
            ((RecyclerView) requireView.findViewById(R.id.media_rec_content_container)).setVisibility(0);
            if (this.f40737c) {
                this.f40736b.requireView().findViewById(R.id.buttons_container).setVisibility(0);
            }
            if (this.f40736b.getHost() instanceof Activity) {
                m29368b(true);
            }
            ((TextView) requireView.findViewById(R.id.media_rec_header_text)).setText(R.string.media_rec_header_text);
        } else if (i2 == 4) {
            m29368b(false);
        }
    }
}

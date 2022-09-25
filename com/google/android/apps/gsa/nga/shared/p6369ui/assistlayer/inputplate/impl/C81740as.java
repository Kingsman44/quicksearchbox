package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip.ChipsCarousel;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.as */
/* compiled from: PG */
public final /* synthetic */ class C81740as implements C83343ad {

    /* renamed from: a */
    public static final /* synthetic */ C81740as f223588a = new C81740as();

    private /* synthetic */ C81740as() {
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        Optional optional = (Optional) obj;
        Optional optional2 = (Optional) obj2;
        Optional optional3 = (Optional) obj3;
        if (optional.isEmpty() || optional2.isEmpty() || optional3.isEmpty()) {
            return Optional.empty();
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) optional.get();
        ViewGroup viewGroup = (ViewGroup) optional2.get();
        ViewGroup viewGroup2 = (ViewGroup) optional3.get();
        return Optional.m71637of(new C81722aa(constraintLayout, viewGroup, viewGroup2, constraintLayout.findViewById(R.id.nga_assist_tactile_single_input_top_space), (ViewGroup) constraintLayout.findViewById(R.id.nga_assist_tactile_single_input_bottom_container), (TranscriptionViewContainer) constraintLayout.findViewById(R.id.nga_assist_transcription_container), (SingleLegalNoticeView) constraintLayout.findViewById(R.id.nga_assist_legal_notice), (ChipsCarousel) constraintLayout.findViewById(R.id.nga_assist_chips_container), (SingleGreetingView) constraintLayout.findViewById(R.id.nga_assist_single_greeting), constraintLayout.findViewById(R.id.nga_assist_single_content_shadow), constraintLayout.findViewById(R.id.nga_assist_single_empty_fre_container), (SingleTrySayingView) constraintLayout.findViewById(R.id.nga_assist_single_trysaying), (TextView) constraintLayout.findViewById(R.id.nga_assist_static_text), (DoubleTopGreetingView) viewGroup.findViewById(R.id.nga_assist_greeting), (C81775c) viewGroup.findViewById(R.id.nga_assist_double_fre_suggestion), (DoubleAppShortcutView) viewGroup.findViewById(R.id.nga_assist_double_app_shortcut), (ChipsCarousel) viewGroup.findViewById(R.id.nga_assist_double_chips), (DoubleTopGreetingView) viewGroup2.findViewById(R.id.nga_assist_top_greeting)));
    }
}

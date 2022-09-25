package com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f;

import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.inject.C47231d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.f.d */
/* compiled from: PG */
public final class C40535d {
    /* renamed from: a */
    public static final C40532a m70259a(Fragment fragment) {
        C40532a aVar;
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(fragment, "fragment");
        Fragment parentFragment = fragment.getParentFragment();
        while (true) {
            if (!(parentFragment instanceof C47231d)) {
                aVar = null;
                break;
            }
            Object z = ((C47231d) parentFragment).mo17754z();
            if (z instanceof C40532a) {
                aVar = (C40532a) z;
                break;
            }
            parentFragment = parentFragment.getParentFragment();
        }
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("The current view hierarchy does not contain any Peer conforming to BubbleContainerApi");
    }

    /* renamed from: b */
    public static final C40538g m70260b(Fragment fragment) {
        C40538g gVar;
        Fragment parentFragment = fragment.getParentFragment();
        while (true) {
            if (!(parentFragment instanceof C47231d)) {
                gVar = null;
                break;
            }
            Object z = ((C47231d) parentFragment).mo17754z();
            if (z instanceof C40538g) {
                gVar = (C40538g) z;
                break;
            }
            parentFragment = parentFragment.getParentFragment();
        }
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("The current view hierarchy does not contain any Peer conforming to XBlendFragmentContainer");
    }
}

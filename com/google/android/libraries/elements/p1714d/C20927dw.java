package com.google.android.libraries.elements.p1714d;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21230a;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21261bd;
import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeDirection;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeOverscrollMode;
import com.google.protos.youtube.elements.C66190dd;
import com.google.protos.youtube.elements.C66192df;
import com.google.protos.youtube.elements.C66206dt;
import com.google.protos.youtube.elements.C66211dy;
import com.google.protos.youtube.elements.C66212dz;
import com.google.protos.youtube.elements.C66216ec;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.android.libraries.elements.d.dw */
/* compiled from: PG */
public final class C20927dw {
    /* renamed from: a */
    public static int m39352a(ScrollableContainerTypeOverscrollMode scrollableContainerTypeOverscrollMode) {
        ScrollableContainerTypeOverscrollMode scrollableContainerTypeOverscrollMode2 = ScrollableContainerTypeOverscrollMode.SCROLLABLE_CONTAINER_TYPE_OVERSCROLL_MODE_UNSPECIFIED;
        ScrollableContainerTypeDirection scrollableContainerTypeDirection = ScrollableContainerTypeDirection.SCROLLABLE_CONTAINER_TYPE_DIRECTION_UNKNOWN;
        int ordinal = scrollableContainerTypeOverscrollMode.ordinal();
        if (ordinal != 1) {
            return ordinal != 3 ? 1 : 0;
        }
        return 2;
    }

    /* renamed from: b */
    public static void m39353b(C21319z zVar) {
        C66192df E = zVar.mo26844E();
        C21261bd C = zVar.mo26842C();
        if (C != null && E != null) {
            C.mo26745b(E, C66190dd.GESTURE_TYPE_SWIPE);
        }
    }

    /* renamed from: c */
    public static void m39354c(View view, C21313t tVar, CommandOuterClass$Command commandOuterClass$Command, C21256az azVar, C21248ar arVar, C66206dt dtVar) {
        C21309p k = C21311r.m40252k();
        C21230a aVar = (C21230a) k;
        aVar.f59560a = view;
        aVar.f59565f = azVar;
        aVar.f59564e = arVar;
        if (dtVar != null) {
            C66211dy dyVar = (C66211dy) C66212dz.f180050c.createBuilder();
            dyVar.copyOnWrite();
            C66212dz dzVar = (C66212dz) dyVar.instance;
            dzVar.f180054b = dtVar;
            dzVar.f180053a |= 1;
            C66216ec ecVar = (C66216ec) SenderStateOuterClass$SenderState.f179521a.createBuilder();
            ecVar.mo58885m(C66212dz.f180051d, (C66212dz) dyVar.build());
            aVar.f59563d = (SenderStateOuterClass$SenderState) ecVar.build();
        }
        tVar.mo26124a(commandOuterClass$Command, k.mo26698a()).mo61453k();
    }
}

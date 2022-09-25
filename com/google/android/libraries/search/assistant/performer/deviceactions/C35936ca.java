package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.invocation.assistdata.p2596b.C33547u;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.afv;
import com.google.assistant.p3897e.p3921j.afw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ca */
/* compiled from: PG */
public final class C35936ca implements C35472h {

    /* renamed from: a */
    public static final C59071e f94093a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.ca");

    /* renamed from: b */
    private final C60887da f94094b;

    /* renamed from: c */
    private final C33547u f94095c;

    public C35936ca(C60887da daVar, C33547u uVar) {
        this.f94094b = daVar;
        this.f94095c = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        ((C59052c) ((C59052c) f94093a.mo56224b()).mo56372aa(51860)).mo56386p("TNG:ScreenNavigationPerfomer");
        int i = 1;
        if (!dyVar.f135936b.equals("device.SCREEN_NAVIGATION")) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, String.format("Invalid ClientOp: %1$s", new Object[]{dyVar.f135936b})));
        }
        try {
            int a = afv.m86306a(((afw) C36183e.m64584b(dyVar, "screen_navigation_args", afw.f135019d.getParserForType())).f135023c);
            if (a != 0) {
                i = a;
            }
            if (i - 2 != 5) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.UNIMPLEMENTED, "Unimplemented screen navigation control"));
            }
            return C47633f.m84733g(this.f94095c.mo38973a()).mo51516i(C35930bz.f94088a, this.f94094b);
        } catch (C35471g unused) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Failed to parse screen navigation args"));
        }
    }
}

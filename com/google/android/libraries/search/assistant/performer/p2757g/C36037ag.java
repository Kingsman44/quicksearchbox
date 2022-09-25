package com.google.android.libraries.search.assistant.performer.p2757g;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36955c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52192iq;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.io.IOException;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.ag */
/* compiled from: PG */
public final class C36037ag implements C35472h {

    /* renamed from: a */
    public static final C59071e f94261a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.g.ag");

    /* renamed from: b */
    public final C21370a f94262b;

    /* renamed from: c */
    private final C60887da f94263c;

    /* renamed from: d */
    private final C36955c f94264d;

    public C36037ag(C36955c cVar, C60887da daVar, C21370a aVar) {
        this.f94264d = cVar;
        this.f94263c = daVar;
        this.f94262b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        String str = dyVar.f135936b;
        if (str.equals("media.SET_FOCUS")) {
            try {
                C52192iq iqVar = (C52192iq) C36183e.m64584b(dyVar, "media_set_focus_args", C52192iq.f136983d.getParserForType());
                int i = iqVar.f136985a;
                if ((i & 4) == 0) {
                    ((C59052c) ((C59052c) f94261a.mo56225c()).mo56372aa(52102)).mo56386p("Fail to store media focus info because focus_duration_ms is not set.");
                    return C60856cj.m92900i(C36180b.m64579c(C52235kf.NOT_FOUND, "Can't find focus_duration_ms in set_focus_args"));
                } else if ((i & 1) != 0) {
                    return C47633f.m84733g(this.f94264d.mo40493a(new C36031aa(this, iqVar))).mo51515h(C36032ab.f94256a, this.f94263c).mo51513e(IOException.class, C36033ac.f94257a, this.f94263c);
                } else {
                    ((C59052c) ((C59052c) f94261a.mo56225c()).mo56372aa(52101)).mo56386p("Fail to store media focus info because device_id is not set.");
                    return C60856cj.m92900i(C36180b.m64579c(C52235kf.NOT_FOUND, "Can't find device_id in set_focus_args"));
                }
            } catch (C35471g unused) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Failed to parse args for client op: ".concat(String.valueOf(str))));
            }
        } else if (str.equals("media.CLEAR_FOCUS")) {
            return C47633f.m84733g(this.f94264d.mo40493a(C36034ad.f94258a)).mo51515h(C36035ae.f94259a, this.f94263c).mo51513e(IOException.class, C36036af.f94260a, this.f94263c);
        } else {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.UNIMPLEMENTED, "Cannot perform client op: ".concat(String.valueOf(str))));
        }
    }
}

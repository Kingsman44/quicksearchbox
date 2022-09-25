package com.google.android.apps.gsa.nga.engine.education;

import android.util.Pair;
import com.google.assistant.p4008y.p4009a.C53577bj;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.ToIntFunction;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ao */
/* compiled from: PG */
public final /* synthetic */ class C75690ao implements ToIntFunction {

    /* renamed from: a */
    public static final /* synthetic */ C75690ao f210119a = new C75690ao();

    private /* synthetic */ C75690ao() {
    }

    public final int applyAsInt(Object obj) {
        C53577bj bjVar = C53577bj.PRIORITY_UNKNOWN;
        int ordinal = ((C53577bj) ((Pair) obj).second).ordinal();
        if (ordinal == 0) {
            ((C58970a) ((C58970a) C75743bc.f210220a.mo56226d()).mo56372aa(3284)).mo56386p("Priority not set - treating as LOW");
            return 0;
        } else if (ordinal == 1) {
            return 0;
        } else {
            if (ordinal == 2) {
                return 1;
            }
            throw new AssertionError();
        }
    }
}

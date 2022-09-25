package com.google.android.libraries.web.p3353c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.web.c.k */
/* compiled from: PG */
public enum C43366k implements C62957cd {
    UNSPECIFIED(0),
    USER_INITIATED_NEW_PAGE(1),
    BROWSER_INITIATED_NEW_PAGE(2),
    REFRESH(3),
    RESTORATION(4),
    GO_BACK(5),
    GO_FORWARD(6),
    NETWORK_RETRY(7);
    

    /* renamed from: i */
    public final int f113292i;

    private C43366k(int i) {
        this.f113292i = i;
    }

    /* renamed from: a */
    public static C43366k m76517a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return USER_INITIATED_NEW_PAGE;
            case 2:
                return BROWSER_INITIATED_NEW_PAGE;
            case 3:
                return REFRESH;
            case 4:
                return RESTORATION;
            case 5:
                return GO_BACK;
            case 6:
                return GO_FORWARD;
            case 7:
                return NETWORK_RETRY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m76518b() {
        return C43365j.f113282a;
    }

    public final int getNumber() {
        return this.f113292i;
    }

    public final String toString() {
        return Integer.toString(this.f113292i);
    }
}

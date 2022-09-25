package p001a.p014d.p015a.p016a;

import com.google.protobuf.C62957cd;

/* renamed from: a.d.a.a.l */
/* compiled from: PG */
public enum C0067l implements C62957cd {
    UNDEFINED(0),
    SEARCH_INTENT(1),
    SEARCH_ACTION_INTENT(2),
    VIEW_ACTION_WITH_URL_INTENT(3),
    SEARCH_INTENT_TEMPLATE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f187g;

    private C0067l(int i) {
        this.f187g = i;
    }

    /* renamed from: a */
    public static C0067l m30a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return SEARCH_INTENT;
        }
        if (i == 2) {
            return SEARCH_ACTION_INTENT;
        }
        if (i == 3) {
            return VIEW_ACTION_WITH_URL_INTENT;
        }
        if (i != 4) {
            return null;
        }
        return SEARCH_INTENT_TEMPLATE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f187g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}

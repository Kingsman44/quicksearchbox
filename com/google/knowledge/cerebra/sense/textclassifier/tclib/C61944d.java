package com.google.knowledge.cerebra.sense.textclassifier.tclib;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.d */
/* compiled from: PG */
final class C61944d extends C61981x {

    /* renamed from: a */
    private final String f167421a;

    /* renamed from: b */
    private final int f167422b;

    public C61944d(String str, int i) {
        if (str != null) {
            this.f167421a = str;
            this.f167422b = i;
            return;
        }
        throw new NullPointerException("Null contactId");
    }

    /* renamed from: a */
    public final String mo58387a() {
        return this.f167421a;
    }

    /* renamed from: b */
    public final int mo58388b() {
        return this.f167422b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61981x) {
            C61981x xVar = (C61981x) obj;
            return this.f167421a.equals(xVar.mo58387a()) && this.f167422b == xVar.mo58388b();
        }
    }

    public final int hashCode() {
        return ((this.f167421a.hashCode() ^ 1000003) * 1000003) ^ this.f167422b;
    }

    public final String toString() {
        String str;
        String str2 = this.f167421a;
        switch (this.f167422b) {
            case 1:
                str = "DISPLAY_NAME_STRUCTURED";
                break;
            case 2:
                str = "DISPLAY_NAME_UNSTRUCTURED";
                break;
            case 3:
                str = "GIVEN_NAME";
                break;
            case 4:
                str = "FAMILY_NAME";
                break;
            case 5:
                str = "NICKNAME";
                break;
            case 6:
                str = "EMAIL_ADDRESS";
                break;
            case 7:
                str = "PHONE_NUMBER";
                break;
            case 8:
                str = "SOURCE_ID";
                break;
            case 9:
                str = "ACCOUNT_TYPE";
                break;
            default:
                str = "ACCOUNT_NAME";
                break;
        }
        return "ContactAttributeKey{contactId=" + str2 + ", type=" + str + "}";
    }
}

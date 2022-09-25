package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class ClientId implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42277bc();

    /* renamed from: a */
    public static final Map f110741a = new HashMap();

    /* renamed from: b */
    public static final ClientId f110742b = m74305a("DRI_M");

    /* renamed from: c */
    public static final ClientId f110743c = m74305a("PHO_S");

    /* renamed from: d */
    public static final ClientId f110744d = m74305a("PHO_WGC_IANTS");
    @Deprecated

    /* renamed from: e */
    public static final ClientId f110745e = m74305a("PHO_ESC");

    /* renamed from: f */
    public static final ClientId f110746f = m74305a("PHO_PS");

    /* renamed from: g */
    public static final ClientId f110747g = m74305a("PEP_PL");

    /* renamed from: h */
    public static final ClientId f110748h = m74305a("MAP_LS");

    /* renamed from: i */
    public static final ClientId f110749i = m74305a("MAP_MS");

    /* renamed from: j */
    public static final ClientId f110750j = m74305a("MAP_O");

    /* renamed from: k */
    public static final ClientId f110751k = m74305a("MAP_OIAS");

    /* renamed from: l */
    public static final ClientId f110752l = m74305a("NWS");

    /* renamed from: m */
    public static final ClientId f110753m = m74305a("NWS_NI");

    /* renamed from: n */
    public static final ClientId f110754n = m74305a("JAM");

    /* renamed from: o */
    public static final ClientId f110755o = m74305a("GAL_S");

    /* renamed from: p */
    public static final ClientId f110756p = m74305a("GOO_H");

    /* renamed from: q */
    public static final ClientId f110757q = m74305a("GML_CE");

    /* renamed from: r */
    public static final ClientId f110758r = m74305a("NGA");

    /* renamed from: s */
    public static final ClientId f110759s = m74305a("KEE");

    /* renamed from: t */
    public static final ClientId f110760t = m74305a("OPA_C");

    /* renamed from: u */
    public static final ClientId f110761u = m74305a("OPA_A");

    /* renamed from: v */
    public static final ClientId f110762v = m74305a("OPA_HCP");

    /* renamed from: w */
    public static final ClientId f110763w = m74305a("BET");

    /* renamed from: x */
    public static final ClientId f110764x = m74305a("REC");

    /* renamed from: y */
    public static final ClientId f110765y = m74305a("DCK");

    /* renamed from: z */
    public final String f110766z;

    static {
        m74305a("SAM");
        m74305a("SAM_L");
        m74305a("SAM_EC");
        m74305a("SAM_CR");
        m74305a("SAM_CA");
        m74305a("SAM_DWFTC");
        m74305a("SAM_EQC");
        m74305a("SAM_PO");
        m74305a("DYN_H");
        m74305a("DYN_RH");
        m74305a("DYN_C");
        m74305a("DYN_RC");
        m74305a("DYN_I");
        m74305a("DYN_RI");
        m74305a("DYN_OOD_H");
        m74305a("DYN_OOD_C");
        m74305a("DYN_OOD_I");
        m74305a("HUB_C");
        m74305a("DRI_S");
        m74305a("DRI_A");
        m74305a("DRI_L");
        m74305a("DRI_D");
        m74305a("DOC_S");
        m74305a("DOC_M");
        m74305a("DOC_L");
        m74305a("SHE_S");
        m74305a("SHE_M");
        m74305a("SHE_L");
        m74305a("SLI_S");
        m74305a("SLI_M");
        m74305a("SLI_L");
        m74305a("MAP_CJS");
        m74305a("TEZ");
        m74305a("TEZ_H");
        m74305a("TEZ_I");
        m74305a("TEZ_R");
        m74305a("TEZ_S");
        m74305a("TEZ_SS");
        m74305a("TEZ_P");
        m74305a("GAL_C");
        m74305a("PAY_S");
        m74305a("GML_C");
        m74305a("GML_G");
        m74305a("CAL");
        m74305a("CAL_A");
        m74305a("CAL_P");
        m74305a("GOO_O");
        m74305a("DUO");
        m74305a("VOI");
    }

    public ClientId(String str) {
        this.f110766z = str;
    }

    /* renamed from: a */
    public static ClientId m74305a(String str) {
        Map map = f110741a;
        if (!map.containsKey(str)) {
            ClientId clientId = new ClientId(str);
            map.put(str, clientId);
            return clientId;
        }
        throw new IllegalArgumentException("Duplicate ClientId name found: ".concat(str));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientId)) {
            return false;
        }
        return this.f110766z.equals(((ClientId) obj).f110766z);
    }

    public final int hashCode() {
        return this.f110766z.hashCode();
    }

    public final String toString() {
        return this.f110766z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110766z);
    }
}

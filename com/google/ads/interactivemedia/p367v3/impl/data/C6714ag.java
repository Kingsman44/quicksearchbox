package com.google.ads.interactivemedia.p367v3.impl.data;

import com.evernote.android.state.BuildConfig;
import com.google.ads.interactivemedia.p367v3.api.FriendlyObstructionPurpose;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ag */
/* compiled from: PG */
final class C6714ag extends C6745bk {
    private Boolean attached;
    private C6726as bounds;
    private String detailedReason;
    private Boolean hidden;
    private FriendlyObstructionPurpose purpose;
    private String type;

    public C6745bk attached(boolean z) {
        this.attached = Boolean.valueOf(z);
        return this;
    }

    public C6745bk bounds(C6726as asVar) {
        if (asVar != null) {
            this.bounds = asVar;
            return this;
        }
        throw new NullPointerException("Null bounds");
    }

    public C6746bl build() {
        String str = this.attached == null ? " attached" : BuildConfig.FLAVOR;
        if (this.bounds == null) {
            str = str.concat(" bounds");
        }
        if (this.hidden == null) {
            str = String.valueOf(str).concat(" hidden");
        }
        if (this.purpose == null) {
            str = String.valueOf(str).concat(" purpose");
        }
        if (this.type == null) {
            str = String.valueOf(str).concat(" type");
        }
        if (str.isEmpty()) {
            return new C6715ah(this.attached.booleanValue(), this.bounds, this.detailedReason, this.hidden.booleanValue(), this.purpose, this.type);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public C6745bk detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    public C6745bk hidden(boolean z) {
        this.hidden = Boolean.valueOf(z);
        return this;
    }

    public C6745bk purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (friendlyObstructionPurpose != null) {
            this.purpose = friendlyObstructionPurpose;
            return this;
        }
        throw new NullPointerException("Null purpose");
    }

    public C6745bk type(String str) {
        if (str != null) {
            this.type = str;
            return this;
        }
        throw new NullPointerException("Null type");
    }
}

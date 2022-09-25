package com.google.ads.interactivemedia.p367v3.impl.data;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.ads.interactivemedia.p367v3.api.FriendlyObstructionPurpose;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.v */
/* compiled from: PG */
final class C6774v implements C6732ay {
    private String detailedReason;
    private FriendlyObstructionPurpose purpose;
    private View view;

    public C6733az build() {
        String str = this.view == null ? " view" : BuildConfig.FLAVOR;
        if (this.purpose == null) {
            str = str.concat(" purpose");
        }
        if (str.isEmpty()) {
            return new C6775w(this.view, this.purpose, this.detailedReason);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public C6732ay detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    public C6732ay purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (friendlyObstructionPurpose != null) {
            this.purpose = friendlyObstructionPurpose;
            return this;
        }
        throw new NullPointerException("Null purpose");
    }

    public C6732ay view(View view2) {
        if (view2 != null) {
            this.view = view2;
            return this;
        }
        throw new NullPointerException("Null view");
    }
}

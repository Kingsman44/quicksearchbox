package com.google.android.libraries.search.silk.web.homescreenshortcuts;

import com.google.android.libraries.web.shared.contrib.WebFeatureConfig;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.search.silk.web.homescreenshortcuts.$AutoValue_SilkHomescreenShortcutsFeature  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_SilkHomescreenShortcutsFeature extends SilkHomescreenShortcutsFeature {

    /* renamed from: a */
    public final WebFeatureConfig f106946a;

    /* renamed from: b */
    public final ProtoParsers.ParcelableProto f106947b;

    public C$AutoValue_SilkHomescreenShortcutsFeature(WebFeatureConfig webFeatureConfig, ProtoParsers.ParcelableProto parcelableProto) {
        if (webFeatureConfig != null) {
            this.f106946a = webFeatureConfig;
            if (parcelableProto != null) {
                this.f106947b = parcelableProto;
                return;
            }
            throw new NullPointerException("Null capabilitiesHeader");
        }
        throw new NullPointerException("Null config");
    }

    /* renamed from: a */
    public final WebFeatureConfig mo41576a() {
        return this.f106946a;
    }

    /* renamed from: d */
    public final ProtoParsers.ParcelableProto mo42586d() {
        return this.f106947b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SilkHomescreenShortcutsFeature) {
            SilkHomescreenShortcutsFeature silkHomescreenShortcutsFeature = (SilkHomescreenShortcutsFeature) obj;
            return this.f106946a.equals(silkHomescreenShortcutsFeature.mo41576a()) && this.f106947b.equals(silkHomescreenShortcutsFeature.mo42586d());
        }
    }

    public final int hashCode() {
        return ((this.f106946a.hashCode() ^ 1000003) * 1000003) ^ this.f106947b.hashCode();
    }

    public final String toString() {
        String obj = this.f106946a.toString();
        String obj2 = this.f106947b.toString();
        return "SilkHomescreenShortcutsFeature{config=" + obj + ", capabilitiesHeader=" + obj2 + "}";
    }
}

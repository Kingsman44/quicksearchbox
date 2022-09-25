package p3186j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: j$.time.zone.f */
final class C41031f extends C41032g {

    /* renamed from: d */
    private final Set f107486d;

    C41031f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String add : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(add);
        }
        this.f107486d = Collections.unmodifiableSet(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C41028c mo43414c(String str) {
        if (this.f107486d.contains(str)) {
            return new C41028c(TimeZone.getTimeZone(str));
        }
        throw new C41029d("Not a built-in time zone: " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Set mo43415d() {
        return this.f107486d;
    }
}

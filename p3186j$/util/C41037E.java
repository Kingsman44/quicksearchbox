package p3186j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: j$.util.E */
final class C41037E extends C41056Y {

    /* renamed from: f */
    final /* synthetic */ SortedSet f107497f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41037E(SortedSet sortedSet, Collection collection) {
        super(21, collection);
        this.f107497f = sortedSet;
    }

    public final Comparator getComparator() {
        return this.f107497f.comparator();
    }
}

package com.android.launcher3.shortcuts;

import java.util.Comparator;

/* compiled from: PG */
public final class ShortcutFilter {
    public static final Comparator RANK_COMPARATOR = new Comparator() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) obj;
            ShortcutInfoCompat shortcutInfoCompat2 = (ShortcutInfoCompat) obj2;
            if (shortcutInfoCompat.isDeclaredInManifest() && !shortcutInfoCompat2.isDeclaredInManifest()) {
                return -1;
            }
            if (shortcutInfoCompat.isDeclaredInManifest() || !shortcutInfoCompat2.isDeclaredInManifest()) {
                int rank = shortcutInfoCompat.getRank();
                int rank2 = shortcutInfoCompat2.getRank();
                if (rank == rank2) {
                    return 0;
                }
                if (rank < rank2) {
                    return -1;
                }
            }
            return 1;
        }
    };
}

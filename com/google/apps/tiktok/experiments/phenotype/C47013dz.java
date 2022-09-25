package com.google.apps.tiktok.experiments.phenotype;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.dz */
/* compiled from: PG */
public final class C47013dz {

    /* renamed from: a */
    public final Set f122557a = new HashSet();

    /* renamed from: b */
    public final Set f122558b = new HashSet();

    /* renamed from: c */
    public final Map f122559c = new HashMap();

    /* renamed from: d */
    public C46917ak f122560d;

    /* renamed from: e */
    public boolean f122561e;

    /* renamed from: a */
    public final boolean mo50977a() {
        C46917ak akVar = this.f122560d;
        if (akVar != null && akVar.mo50921h()) {
            return true;
        }
        Collection<C46917ak> values = this.f122559c.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (C46917ak h : values) {
                if (h.mo50921h()) {
                    return true;
                }
            }
        }
        return false;
    }
}

package com.google.ads.interactivemedia.p367v3.impl.data;

import com.google.ads.interactivemedia.p367v3.api.FriendlyObstruction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bj */
/* compiled from: PG */
public abstract class C6744bj {
    public abstract C6747bm build();

    public C6744bj friendlyObstructions(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            FriendlyObstruction friendlyObstruction = (FriendlyObstruction) it.next();
            arrayList.add(C6746bl.builder().view(friendlyObstruction.getView()).purpose(friendlyObstruction.getPurpose()).detailedReason(friendlyObstruction.getDetailedReason()).build());
        }
        return obstructions(arrayList);
    }

    public abstract C6744bj obstructions(List list);
}

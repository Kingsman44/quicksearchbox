package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class IntersectionObserver {
    public abstract Status criteriaMatched(ArrayList arrayList);

    public abstract ArrayList getCriteriaList();

    public abstract String getGroupId();
}

package com.facebook.litho;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class TestItem {

    /* renamed from: a */
    public String f17949a;

    /* renamed from: b */
    public final Rect f17950b = new Rect();

    /* renamed from: c */
    public ComponentHost f17951c;

    /* renamed from: d */
    public Object f17952d;

    /* renamed from: e */
    private final AcquireKey f17953e = new AcquireKey();

    /* compiled from: PG */
    public final class AcquireKey {
    }

    public AcquireKey getAcquireKey() {
        return this.f17953e;
    }

    public Rect getBounds() {
        return this.f17950b;
    }

    public ComponentHost getHost() {
        return this.f17951c;
    }

    public String getTestKey() {
        return this.f17949a;
    }

    public String getTextContent() {
        List textItems = C6563y.m17862a(Collections.singletonList(this.f17952d)).getTextItems();
        StringBuilder sb = new StringBuilder();
        int size = textItems.size();
        for (int i = 0; i < size; i++) {
            sb.append((CharSequence) textItems.get(i));
        }
        return sb.toString();
    }
}

package com.android.launcher3.graphics;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.shapes.PathShape;

/* compiled from: PG */
public final class TriangleShape extends PathShape {
    private final Path mTriangularPath;

    public TriangleShape(Path path, float f, float f2) {
        super(path, f, f2);
        this.mTriangularPath = path;
    }

    public final void getOutline(Outline outline) {
        outline.setConvexPath(this.mTriangularPath);
    }
}

package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: PG */
    public @interface WebMessagePayloadType {
        public static final int TYPE_STRING = 0;
    }

    String getAsString();

    int getType();
}

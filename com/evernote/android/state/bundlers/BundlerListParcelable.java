package com.evernote.android.state.bundlers;

import android.os.Bundle;
import com.evernote.android.state.Bundler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class BundlerListParcelable implements Bundler {
    public List get(String str, Bundle bundle) {
        return bundle.getParcelableArrayList(str);
    }

    public void put(String str, List list, Bundle bundle) {
        bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
    }
}

package org.victoryaxon.android.tipcalc.fragments;

import org.victoryaxon.android.tipcalc.model.TipRecord;

/**
 * Created by victoryaxon.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
